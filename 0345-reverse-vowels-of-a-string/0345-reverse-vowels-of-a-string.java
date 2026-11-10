class Solution {
    public String reverseVowels(String s) {
        List<Character> ls=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if("aeiouAEIOU".indexOf(c)!=-1) ls.add(c);
        }
        int index=ls.size()-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if("aeiouAEIOU".indexOf(c)!=-1) {
                sb.append(ls.get(index));
                index--;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}