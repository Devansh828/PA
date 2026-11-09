class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        int left=0;
        int right=0;
        for(int i=0;i<timeSeries.length;i++){
            if(i==0){
                left=timeSeries[i];
                right=timeSeries[i]+duration-1;
            }
            else if(timeSeries[i]>right){
                ans+=(right-left+1);
                left=timeSeries[i];
                right=timeSeries[i]+duration-1;
            }
            else if(timeSeries[i]<=right){
                ans+=(timeSeries[i]-left);
                left=timeSeries[i];
                right=timeSeries[i]+duration-1;
            }
        }
        if(timeSeries.length>0)
        ans+=(right-left+1);
        return ans;
    }
}