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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=null;
        ListNode temp3=null;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                if(head==null){
                    head=temp1;
                    temp3=head;
                }
                else{
                    temp3.next=temp1;
                    temp3=temp3.next;
                }

                temp1=temp1.next;

            }

            else{
                if(head==null){
                    head=temp2;
                    temp3=head;
                }
                else{
                    temp3.next=temp2;
                    temp3=temp3.next;
                }

                temp2=temp2.next;
            }

            
        }

        if(temp1!=null){
            if(head!=null)
            temp3.next=temp1;

            else head=temp1;
        }
        if(temp2!=null){
            if(head!=null)
            temp3.next=temp2;

            else head=temp2;
        }

        return head;
    }
}