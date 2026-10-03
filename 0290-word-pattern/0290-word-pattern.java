class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        String[] letters=new String[26];
        // System.out.println(Arrays.toString(letters));
        Map<String,Character> mp=new HashMap<>();
        if(arr.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            int index=c-'a';
            if(letters[index]==null )  letters[index]=arr[i];
            else if(!letters[index].equals(arr[i]))  return false;

            String word=arr[i];

            if(mp.getOrDefault(word,' ')==' ') {
                mp.put(word,c);
            }
            else if(mp.get(word)!=c) return false;
        }
        return true;
    }
}