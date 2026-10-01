class Node{
    String url;

    Node next;
    Node prev;

    public Node(String s){
        url=s;
    }
}
class BrowserHistory {

    Node page;
    Node curr;
    // int size=0;


    public BrowserHistory(String homepage) {
        page=new Node(homepage);
        curr=page;
        // size++;
    }
    
    public void visit(String url) {
        
        curr.next=new Node(url);
        curr.next.prev=curr;
        curr=curr.next;
        // int s=0;
        // Node temp=page;
        // while(temp!=curr){
        //     s++;
        //     temp=temp.next;
        // }
        // s++;
        // size=s;
    }
    
    public String back(int steps) {
        while(steps!=0){
            if(curr.prev!=null){
                curr=curr.prev;
            }
            steps--;
        }

        return curr.url;
    }
    
    public String forward(int steps) {
        while(steps!=0){
            if(curr.next!=null){
                curr=curr.next;
            }
            steps--;
        }

        return curr.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */