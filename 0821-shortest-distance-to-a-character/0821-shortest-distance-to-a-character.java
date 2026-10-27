class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];

        for(int  i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a==c) {
                ans[i]=0;
                continue;
            }
            
            String s1=s.substring(0,i);
            String s2=s.substring(i,s.length());
            int i1=s1.lastIndexOf(c);
            int i2=s2.indexOf(c);

            int a1=Integer.MAX_VALUE;
            int a2=Integer.MAX_VALUE;
            if(i1!=-1)
            a1=i-i1;

            if(i2!=-1)
            a2=i+i2-i;

            int minN=Math.min(a1,a2);

            ans[i]=minN;
        }

        return ans;
    }
}