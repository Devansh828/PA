public class BinarySearch {
    static int Foccurrence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
                
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    
    static int Loccurrence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
                
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    
    // static int bs(int[] arr,int target){
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]==target)
    //         return mid;
    //         else if(arr[mid]<target) low=mid+1;
    //         else high=mid-1;
    //     }
    //     return -1;
    // }
    
	public static void main(String[] args) {
	    int[] arr={1,2,2,2,3,4,5};
	    
	    int target=2;
	    int first=Foccurrence(arr,target);
	    int last=Loccurrence(arr,target);
	    
	    if(first==-1){
	        System.out.println("Element not found");
	    }
	    else{
	        System.out.println("Element found"+(last-first+1));
	    }
	    
	}
}
