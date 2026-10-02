class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greater = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            greater[i] = -1;
        }
        Stack<Integer> help = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            if (help.isEmpty()) {
                help.push(i);
            } else if (nums2[i] <= nums2[help.peek()]) {
                help.push(i);
            } else {
                while (!help.isEmpty() && nums2[i] > nums2[help.peek()]) {
                    greater[help.peek()] = nums2[i];
                    help.pop();
                }
                help.push(i);
            }

        }


        int[] ans=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }

            ans[i]=greater[index];
        }






        System.out.println(Arrays.toString(greater));
        return ans;
    }
}