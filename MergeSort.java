import java.util.Arrays;

public class MergeSort {

    public static void mergeAndSort(int[] arr,int low,int mid,int high) {
        int temp[] = new int[high-low+1];
        int idx = 0;
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){  //(arr[left]>arr[right]) for descending order
                temp[idx++] = arr[left++]; 
            }
            else{
                temp[idx++] = arr[right++];
            }
        }

        // Enter the remaining elements
        while(left<=mid){
            temp[idx++] = arr[left++]; 
        }
        while(right<=high){
            temp[idx++] = arr[right++]; 
        }

        //copy elements to the main array
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void divide(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        mergeAndSort(arr, low, mid, high);
    }

    public static void main(String args[]) {
        int arr[] = new int[]{4,7,1,3,9,7,5,6,0};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
