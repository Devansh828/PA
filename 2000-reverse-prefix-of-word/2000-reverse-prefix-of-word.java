class Solution {
    public String reversePrefix(String word, char ch) {
        char[] charArr=word.toCharArray();
        StringBuilder sc=new StringBuilder();
        int index=-1;
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]==ch){
                index=i;
                break;
            }
        }

        for(int i=index;i>=0;i--){
            sc.append(charArr[i]);
        }
        for(int i=index+1;i<charArr.length;i++){
            sc.append(charArr[i]);
        }

        return sc.toString();
    }
}