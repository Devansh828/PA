class Solution {

    public int maximumRectangle(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[i] < height[st.peek()]) {
                int index = st.peek();
                st.pop();
                if (!st.isEmpty()) {
                    ans = Math.max(ans, height[index] * (i - st.peek() - 1));

                } else
                    ans = Math.max(ans, height[index] * i);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int index = st.peek();
            st.pop();
            if (!st.isEmpty()) {
                ans = Math.max(ans, height[index] * (n - st.peek() - 1));

            } else
                ans = Math.max(ans, height[index] * n);
        }

        return ans;

    }

    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int[] height = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                } else
                    height[j] += 1;
            }

            ans = Math.max(ans, maximumRectangle(height));
        }

        return ans;
    }
}