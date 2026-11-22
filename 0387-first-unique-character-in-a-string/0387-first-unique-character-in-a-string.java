class Solution {
    public int firstUniqChar(String s) {
        int[] help=new int[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            help[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(help[c-'a']==1) return i;
        }

        return -1;
    }
}