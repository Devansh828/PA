class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int small=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c>='A' && c<='Z') cap++;

            if(c>='a' && c<='z') small++;
        }

        if(cap==word.length()) return true;

        else if(small==word.length()) return true;

        else if(cap==1 && small==word.length()-1 && Character.isUpperCase(word.charAt(0))  ) return true;

        else return false;
    }
}