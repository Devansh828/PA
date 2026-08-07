class Solution {

    public int solve(int[] cost,int index){
        if(index>=cost.length) return 0;
        return cost[index]+Math.min(solve(cost,index+1),solve(cost,index+2));
    }

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(solve(cost,0),solve(cost,1));
    }
}