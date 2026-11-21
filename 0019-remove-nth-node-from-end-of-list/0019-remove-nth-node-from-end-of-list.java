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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        temp=head;
        int number= count-n+1;
        if(number==1) return head.next;
        ListNode prev=null;
        while(number>1 && temp!=null){
            prev=temp;
            temp=temp.next;
            number--;
        }
        prev.next=temp.next;
        return head;
    }
}