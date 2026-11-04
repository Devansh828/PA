class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            int index=i%nums.length;
            ans[i]=nums[index];
        }

        return ans;
    }
}