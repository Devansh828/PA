class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String,List<String>> mp=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] cArr=s.toCharArray();

            Arrays.sort(cArr);
            String key=new String(cArr);

            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(s);

            
        }


        return new ArrayList<>(mp.values());
    }
}