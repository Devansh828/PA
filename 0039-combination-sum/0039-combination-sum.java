class Solution {

    private void help(int[] candidates,int target,int start,List<Integer> help, List<List<Integer>> ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(help));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            help.add(candidates[i]);
            help(candidates,target-candidates[i],i,help,ans);
            help.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> help=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        help(candidates,target,0,help,ans);
        return ans;
    }
}