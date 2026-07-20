public class SlidingWindow {
    public static void main(String[] args) {
        int[]arr={2,5,3,8,1,6};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            System.out.println(sum);
        }
    }
}   