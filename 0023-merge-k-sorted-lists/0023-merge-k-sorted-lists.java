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

    private ListNode merge(ListNode head1,ListNode head2){
        if(head1==null && head2==null){
            return null;
        }
        else if(head1==null) return head2;
        else if(head2==null) return head1;

        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        ListNode temp1=head1;
        ListNode temp2=head2;
        while(temp1!=null && temp2!=null){

            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }

            else{
                temp.next=temp2;
                temp2=temp2.next;
            }

            temp=temp.next;

        }

        if(temp1!=null){
            temp.next=temp1;
            // temp=ans.next;
            // temp1=temp1.next;
        }
        if(temp2!=null){
            temp.next=temp2;
            // ans=ans.next;
            // temp2=temp2.next;
        }

        return ans.next;


    }

    ListNode mergeSort(ListNode[] lists,int start,int end){

        if(start>end) return null;

        if(start==end) return lists[start];

        int middle=start+(end-start)/2;

        ListNode left=mergeSort(lists,start,middle);

        ListNode right=mergeSort(lists,middle+1,end);

        lists[start]=merge(left,right);

        return lists[start];

    }

    public ListNode mergeKLists(ListNode[] lists) {
        // ListNode ans=null;

        // for(int i=0;i<lists.length;i++){
        //     ans=merge(ans,lists[i]);
        // }

        // return ans;
        

        return mergeSort(lists,0,lists.length-1);

    }
}