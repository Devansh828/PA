class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> help=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            help.put(arr[i],help.getOrDefault(arr[i],0)+1);
        }

        int ans=-1;

        for(Map.Entry<Integer,Integer> m:help.entrySet()){
            int key=m.getKey();
            int val=m.getValue();

            if(key==val){
                if(key>ans) ans=key;
            }
        }

        return ans;
    }
}