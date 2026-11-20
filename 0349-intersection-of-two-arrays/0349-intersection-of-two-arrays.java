class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        int[] arr=new int[1001];
        for(int a:nums1) arr[a]++;

        for(int a:nums2){
            if(arr[a]!=0) {
                l.add(a);
                arr[a]=0;
            }
        }

        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        
        return ans;

    }
}