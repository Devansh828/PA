class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ls=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });

        ls.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int firstPrev=ls.get(ls.size()-1)[0];
            int secondPrev=ls.get(ls.size()-1)[1];

            if(secondPrev>=intervals[i][0]){
                ls.get(ls.size()-1)[1]=Math.max(intervals[i][1],ls.get(ls.size()-1)[1]);
            }
            else{
                ls.add(intervals[i]);
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