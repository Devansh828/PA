class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                ans.add(val);
            }
        }

        int[] help=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            help[i]=ans.get(i);
        }

        return help;
    }
}