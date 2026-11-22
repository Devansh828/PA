class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Integer> ls=new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            ls.add(entry.getKey());
        }

        ls.sort((a,b)->{
            return Integer.compare(mp.get(b),mp.get(a));
        });
        
        System.out.println(ls.toString());

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=ls.get(i);
        }

        return ans;
    }
}