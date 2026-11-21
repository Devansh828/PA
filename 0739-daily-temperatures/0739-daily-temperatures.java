class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        ans[temperatures.length-1]=0;

        Deque<Integer> st=new ArrayDeque<>();

        st.push(temperatures.length-1);

        for(int i=temperatures.length-2;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }

            st.push(i);
        }


        return ans;

    }
}