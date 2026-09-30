/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    void help(Node head){
        if(head==null) return;
        Node nextNode=null;
        if(head.child!=null){
            nextNode=head.next;
            
            head.next=head.child;

            head.next.prev=head;

            head.child=null;
        }

        help(head.next);

        while(head.next!=null){
            head=head.next;
        }

        head.next=nextNode;
        if(nextNode!=null)
        nextNode.prev=head;
    }
    public Node flatten(Node head) {
        help(head);

        return head;
    }
}