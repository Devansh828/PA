class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int num=left;num<=right;num++){
            int n=num;
            boolean a=true;
            while(n!=0){
                int r=n%10;

                if(r==0 || num%r!=0){
                    a=false;
                    break;
                }
                n/=10;
            }

            if(a) ans.add(num);
        }

        return ans;
    }
}