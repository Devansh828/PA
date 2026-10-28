class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num!=0){
                int r=num%10;
                st.push(r);
                num/=10;
            }
            while(!st.isEmpty()){
                l.add(st.pop());
            }
        }

        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}