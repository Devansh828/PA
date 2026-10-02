class Solution {
    public int minAddToMakeValid(String s) {
        // int prev=-1;
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(left<0 && c=='('){
                ans+=Math.abs(left);
                left=1;
            }
            else if(c=='(') left++;
            else if(c==')') left--;
        }

        ans+=Math.abs(left);
        return ans;

    }
}