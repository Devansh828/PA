class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ls=new ArrayList<>();

        List<int[]> help=new ArrayList<>();

        boolean a=false;

        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>newInterval[0]){
                help.add(newInterval);
                a=true;
            }
            help.add(intervals[i]);
        }

        if(a==false){
            help.add(newInterval);
        }



        ls.add(help.get(0));

        for(int i=1;i<help.size();i++){
            int firstPrev=ls.get(ls.size()-1)[0];
            int secondPrev=ls.get(ls.size()-1)[1];

            if(secondPrev>=help.get(i)[0]){
                ls.get(ls.size()-1)[1]=Math.max(help.get(i)[1],ls.get(ls.size()-1)[1]);
            }
            else{
                ls.add(help.get(i));
            }
        }

        int[][] ans=new int[ls.size()][2];

        for(int i=0;i<ls.size();i++){
            ans[i][0]=ls.get(i)[0];
            ans[i][1]=ls.get(i)[1];
        }

        return ans;

    }
}