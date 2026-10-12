class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int a=1;
        int zeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            a*=nums[i];
            else
            zeroes++;
        }
        if(zeroes==nums.length) a=0;

        for(int i=0;i<nums.length;i++){
            if(zeroes==0)
            ans[i]=(a/nums[i]);
            

            else {
                if(nums[i]!=0 ){
                    ans[i]=0;
                }
                else{

                    if(zeroes==1)
                    ans[i]=a;

                    else
                    ans[i]=0;
                }
            }


        }

        return ans;
    }
}