/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    private Node find(Node head,Node headCopy,Node findNode){

        if(findNode==null) return null;

        while(head!=findNode){
            head=head.next;
            headCopy=headCopy.next;
        }

        return headCopy;

    }

    public Node copyRandomList(Node head) {
        
        if(head==null) return null;

        Node headCopy=new Node(0);

        Node tail=head;
        Node tailCopy=headCopy;

        
        while(tail!=null){
            tailCopy.next=new Node(tail.val);

            tail=tail.next;
            tailCopy=tailCopy.next;
        }

        headCopy=headCopy.next;

        tail=head;

        tailCopy=headCopy;
        
        while(tail!=null){
            tailCopy.random=find(head,headCopy,tail.random);

            tail=tail.next;
            tailCopy=tailCopy.next;
        }

        return headCopy;

    }
}