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
    public Node flatten(Node head) {
        if(head==null) return head;
        Node temp=head;

        List<Node> l=new ArrayList<>();
        Node prevNode=null;
        while(temp!=null){
            Node nextNode=temp.next;
            if(temp.child!=null){
                if(nextNode!=null)
                l.add(nextNode);
                Node c=temp.child;
                temp.next=c;
                c.prev=temp;
                temp.child=null;
            }
            prevNode=temp;
            temp=temp.next;

        }

        for(int i=l.size()-1;i>=0;i--){
            while(prevNode.next!=null){
                prevNode=prevNode.next;
            }
            
            flatten(l.get(i));

            l.get(i).prev=prevNode;
            prevNode.next=l.get(i);
        }
        return head;
    }
}