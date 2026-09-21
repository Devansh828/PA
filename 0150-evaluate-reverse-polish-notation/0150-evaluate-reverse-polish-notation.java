class Solution {

    public Boolean validOperator(String s){
        return ("+-*/".contains(s));
    }

    int calculation(int a,int b,String s){
        if(s.equals("+")) return a+b;
        else if(s.equals("-")) return a-b;
        else if(s.equals("*")) return a*b;
        else if(s.equals("/")){
            if(b!=0) return a/b;
        }
        return 0;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(validOperator(s)){
                if(!st.empty()){
                    int b=st.pop();
                    int a=st.pop();
                    st.push(calculation(a,b,s));
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}