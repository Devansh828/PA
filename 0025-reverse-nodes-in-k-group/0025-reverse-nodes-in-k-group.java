/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int countNodes(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    ListNode help(ListNode head,int k){
        if(head==null) return null;
        if(countNodes(head)<k) return head;
        

        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        ListNode last=head;
        for(int i=0;i<k;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode join=help(curr,k);

        last.next=join;

        return prev;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        return help(head,k);
    }
}