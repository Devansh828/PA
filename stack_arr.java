public class stack_arr {

    static class Stack{
        int[] arr;

        int top;

        Stack(int size){
            arr=new int[size];
            top=-1;
        }

        void push(int value){
            if(top==arr.length){
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top]=value;
        }

        int peek(){
            if(top==-1){
                System.out.println("empty");
                return -1;
            }
            return arr[top];
        }

        int pop(){
            if(top==-1){
                System.out.println("empty");
                return -1;
            }
            return arr[top--];
        }

        void display(){
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Popped: " + st.pop());

        System.out.println("Top Element is " + st.peek());
    }
}