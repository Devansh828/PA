class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[!?',;.\"]"," ");
        Map<String,Integer> mp=new HashMap<>();
        // Map<Integer,String[]> newMp=new HashMap<>();
        for(String s:paragraph.split("\s+")){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }

        for(int i=0;i<banned.length;i++){
            mp.put(banned[i],-1);
        }

        int maxValue=-1;
        for(int a:mp.values()){
            if(a>maxValue) maxValue=a;
        }

        for(Map.Entry<String,Integer> m:mp.entrySet()){
            if(m.getValue()==maxValue){
                return m.getKey();
            }
        }

        return null;
        
    }
}