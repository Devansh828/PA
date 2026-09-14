public class Stack_linked {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{
        Node top;

        Stack(){
            this.top=null;
        }

        void push(int value){
            Node newNode=new Node(value);
            newNode.next=top;
            top=newNode;
        }

        int peek(){
            if(top==null){
                System.out.println("empty");
                return -1;
            }
            return top.data;
        }

        int pop(){
            if(top==null){
                System.out.println("empty");
                return -1;
            }
            int value=top.data;
            top=top.next;
            return value;
        }

        void display(){
            Node current=top;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Popped: " + st.pop());

        System.out.println("Top Element is " + st.peek());
    }
}
