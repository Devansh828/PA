class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sc=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c==')'){
                open--;
                if(open==0){
                    while(!st.isEmpty()){
                        ans.append(st.pop());

                    }
                    ans.setLength(ans.length()-1);

                    continue;
                }
                while(st.peek()!='('){
                    sc.append(st.pop());
                }
                st.pop();
                for(int j=0;j<sc.length();j++){
                    char a=sc.charAt(j);
                    st.push(a);
                }
                // if(i==s.length()-1){
                //     return sc.toString();
                // }
                sc.setLength(0);
            }
            else if(c=='(')  {
                st.push(c);
                open++;
            }
            else if(st.size()>0){
                st.push(c);
            }

            if(st.size()==0){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}