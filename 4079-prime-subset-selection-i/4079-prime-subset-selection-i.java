class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans=new ArrayList<>();
        
        int sum=0;
        for(int i=2;i<=n;i++){
            boolean flag=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                if (sum + i <= s) {
                    sum += i;
                    ans.add(i);
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}