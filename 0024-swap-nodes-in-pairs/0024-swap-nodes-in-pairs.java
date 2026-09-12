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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head.next.next;
        ListNode first=head;
        ListNode second=head.next;
        
        first.next=temp;
        second.next=head;
        head=second;

        while(temp!=null && temp.next!=null){

            ListNode prev=first;

            first=temp;
            second=temp.next;

            prev.next=second;

            temp=temp.next.next;
            first.next=temp;
            second.next=first;


            

        }

        return head;

    }
}