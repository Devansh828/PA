class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++){
            
            int complement=target-nums[i];

            if(mp.getOrDefault(complement,-1)!=-1){
                ans[0]=mp.get(complement);
                ans[1]=i;
                return ans;
            }

            mp.put(nums[i],i);

        }

        return ans;

    }
}