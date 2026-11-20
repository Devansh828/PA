class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> star=new ArrayDeque<>();
        Deque<Integer> bracket=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='*') star.push(i);

            else if(c=='(') bracket.push(i);

            else{
                if(bracket.isEmpty()){
                    if(star.isEmpty()) return false;
                    else star.pop();
                }

                else{
                    bracket.pop();
                }
            }

        }


        while(!bracket.isEmpty()){
            if(star.isEmpty()) return false;

            if(star.pop()<bracket.pop()) return false;
        }

        return bracket.isEmpty();
    }
}