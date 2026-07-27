import java.util.Arrays;

public class selectionSort {
    public static void selectionSortAsc(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    
    public static void selectionSortDesc(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
    }
    
	public static void main(String[] args) {
	    
		int[] arr={5,3,8,4,2};
		selectionSortAsc(arr);
		System.out.println(Arrays.toString(arr));
		selectionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}
}
