public class Main
{
    public static int maxSum(int[] arr,int k) throws Exception{
        if(k<=0 || k>=arr.length)
            throw new Exception("out");
        int windowSum=0;
        int start=0;
        int end=k;
        for(int i=start;i<end;i++)
            windowSum+=arr[i];
        int maxSum=windowSum;
        for(int i=end;i<arr.length && start<arr.length;i++){
            windowSum=windowSum-arr[start]+arr[i];
            maxSum=Math.max(windowSum,maxSum);
            start++;
        }
        return maxSum;
    }
	public static void main(String[] args) throws Exception {
		int[] arr={2,1,5,1,3,2};
		System.out.println(maxSum(arr,3));
		
	}
}