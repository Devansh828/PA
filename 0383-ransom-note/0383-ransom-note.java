class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ran=new int[26];
        int[] mag=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            ran[c-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            mag[c-'a']++;
        }

        for(int i=0;i<26;i++){
            int n=mag[i];
            ran[i]=ran[i]-n;

            if(ran[i]>0) return false;
        }

        return true;

        
    }
}