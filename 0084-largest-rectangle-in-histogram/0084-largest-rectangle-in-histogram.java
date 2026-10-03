class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] smallRight=new int[n];
        int[] smallLeft=new int[n];

        

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && heights[i]<heights[st.peek()]){
                smallRight[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }

        while(!st.empty()){
            smallRight[st.peek()]=n;
            st.pop();
        }


        for(int i=n-1;i>=0;i--){
            while(!st.empty() && heights[i]<heights[st.peek()]){
                smallLeft[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }

        while(!st.empty()){
            smallLeft[st.peek()]=-1;
            st.pop();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int height=heights[i];
            int width=smallRight[i]-smallLeft[i]-1;
            ans=Math.max(ans,height*width);

        }

        return ans;



        
    }
}