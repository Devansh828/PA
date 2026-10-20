class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> mp1=new HashMap<>();
        Map<String,Integer> mp2=new HashMap<>();

        List<String> ls=new ArrayList<>();

        for(String s:s1.split(" ")){
            mp1.put(s,mp1.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            mp2.put(s,mp2.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> m:mp1.entrySet()){
            if(m.getValue()==1){
                if(mp2.getOrDefault(m.getKey(),0)==0){
                    ls.add(m.getKey());
                }
            }
        }

        for(Map.Entry<String,Integer> m:mp2.entrySet()){
            if(m.getValue()==1){
                if(mp1.getOrDefault(m.getKey(),0)==0){
                    ls.add(m.getKey());
                }
            }
        }

        

        return ls.toArray(new String[0]);
    }
}