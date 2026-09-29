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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        int size=0;

        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        k=k%size;

        if(k==0) return head;

        int steps=size-k-1;

        temp=head;

        while(steps!=0){
            temp=temp.next;
            steps--;
        }

        ListNode newHead=temp.next;

        temp.next=null;

        temp=newHead;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=head;

        return newHead;

        


    }
}