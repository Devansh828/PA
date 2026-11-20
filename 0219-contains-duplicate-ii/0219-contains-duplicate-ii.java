class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s=new HashSet<>();
        int index=0;
        for(int i=0;i<=k;i++){
            if(i<nums.length)
            if(!s.add(nums[i])) return true;
        }
        for(int j=k+1;j<nums.length;j++){
            s.remove(Integer.valueOf(nums[index]));
            if(!s.add(nums[j])) return true;
            index++;
        }

        return false;
    }
}