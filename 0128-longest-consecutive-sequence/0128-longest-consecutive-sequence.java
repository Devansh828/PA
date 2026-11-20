class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int ans=0;
        int count=1;

        boolean first=false;
        int previous=0;


        for(int a:set){
            System.out.println(a);
            if(!first) {
                previous=a;
                first=true;
                count=1;
            }
            else{
                if(previous+1==a){
                    count++;
                    previous=a;
                }
                else{
                    ans=Math.max(ans,count);
                    previous=a;
                    count=1;
                }
            }
        }

        ans=Math.max(count,ans);

        return ans;
    }
}