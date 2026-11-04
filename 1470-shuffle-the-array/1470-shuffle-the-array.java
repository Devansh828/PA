class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length/2;
        int index=0;

        while(j<nums.length){
            ans[index]=nums[i];
            ans[index+1]=nums[j];

            index+=2;
            i++;
            j++;
        }

        return ans;
    }
}