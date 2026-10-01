class Solution {

    boolean help(int[] nums,int start,int end,int player_1,int player_2, boolean turn){
        if(start>end){
            if(player_1>=player_2) return true;
            else return false;
        }

        if(turn==true){
            boolean a=help(nums,start+1,end,player_1+nums[start],player_2,false);
            boolean b=help(nums,start,end-1,player_1+nums[end],player_2,false);

            return a || b;
        }
        else{
            boolean c=help(nums,start+1,end,player_1,nums[start]+player_2,true);
            boolean d=help(nums,start,end-1,player_1,nums[end]+player_2,true);

            return c && d;
        }
    }

    public boolean predictTheWinner(int[] nums) {
        return help(nums,0,nums.length-1,0,0,true);
    }
}