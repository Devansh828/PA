class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);

            int index=c-'a';
            arr[index]++;
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            int index=c-'a';
            arr[index]--;
        } 

        for(int i=0;i<26;i++){
            if(arr[i]!=0)  return (char)(i+'a'); 
        }

        return '\0';
    }
}