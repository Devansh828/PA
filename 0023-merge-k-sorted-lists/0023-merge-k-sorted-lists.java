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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)  return null;
        int count=lists.length;
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        while(count!=0){
            int min_val=Integer.MAX_VALUE;
            ListNode node=null;
            int index=-1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null)
                if(min_val>lists[i].val){
                    min_val=lists[i].val;
                    node=lists[i];
                    index=i;
                }
            }
            
            if(temp!=null){
                temp.next=node;
                temp=temp.next;
            }
            


            if(index>=0)
            lists[index]=lists[index].next;
            
            if((index>=0 && lists[index]==null) || index==-1) count--;
        }

        return ans.next;
    }
}