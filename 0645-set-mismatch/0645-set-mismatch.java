class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans[0]=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        int n=nums.length;

        int nn=(n)*(n+1);

        int sum1=nn/2;

        ans[1]=sum1-sum;

        return ans;

    }
}