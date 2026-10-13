class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[]  help=new int[n];
        long ans=0;
        for(int i=0;i<n;i++){
            help[i]=Math.abs(nums[i]);
        }
        Arrays.sort(help);
        for(int i=0;i<n/2;i++){
            // int bigIndex=n-1-i;
            // int smallIndex=i;
            int big=help[n-1-i];
            int small=help[i];
            // System.out.println(bigIndex + " " + smallIndex);
            // if(bigIndex!=smallIndex)
            ans+=(big*big-small*small);
            
            // else ans+=(big*big);
        }

        if(n%2==1){
            ans+=(help[n/2]*help[n/2]);
        }

        return ans;
        // 1 2 3 4 5 6
        // 1 2 3   3/2=1
        // 0 1
        // 0   2
        //

    }
}