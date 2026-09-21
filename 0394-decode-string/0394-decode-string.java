class Solution {
    public String decodeString(String s) {
        Stack<Integer> cStack=new Stack<>();
        Stack<String> sStack=new Stack<>();

        String cString="";
        int cNumber=0;

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)) cNumber=cNumber*10+(c-'0');
            else if(c=='['){
                cStack.push(cNumber);
                sStack.push(cString);
                cNumber=0;
                cString="";
            }
            else if(c==']'){
                int n=cStack.pop();
                String pString=sStack.pop();
                StringBuilder temp=new StringBuilder();
                for(int i=0;i<n;i++){
                    temp.append(cString);
                }
                cString=pString+temp.toString();
            }
            else  cString+=c;
        }
        return cString;

    }
}