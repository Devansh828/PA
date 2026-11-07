class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sc=new StringBuilder();
        int i=0;
        int j=0;

        while(i<word1.length() || j<word2.length()){

            if(i<word1.length() && j<word2.length()){
                sc.append(word1.charAt(i));
                sc.append(word2.charAt(j));
                i++;
                j++;
            }

            else if(i<word1.length()){
                sc.append(word1.charAt(i));
                i++;
            }

            else{
                sc.append(word2.charAt(j));
                j++;
            }
        }


        return sc.toString();
        
    }
}