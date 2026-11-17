class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // (1)=(1000)
        // (-1)=(-1000)
        //  0

        int[] help=new int[2001];

        for(int i=0;i<arr.length;i++){
            help[arr[i]+1000]++;
        }

        HashSet<Integer> a=new HashSet<>();

        for(int i=0;i<2001;i++){
            if(help[i]==0) continue;

            if(a.contains(help[i])) return false;

            a.add(help[i]);
        }


        return true;
        
    }
}