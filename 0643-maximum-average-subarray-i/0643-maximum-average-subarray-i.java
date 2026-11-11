class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double sum=0;
        double maxSum=0;
        int index=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[index];
            index++;
            if(sum>maxSum) maxSum=sum;
        }

        ans=maxSum/k;

        return ans;
        
    }
}