import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

    public static void arraySum(int arr[], int idx, int sum, ArrayList<Integer> ds) {
        if (idx == arr.length) {
            ds.add(sum);
            return;
        }
        sum = sum + arr[idx];
        arraySum(arr, idx + 1, sum, ds);
        sum = sum - arr[idx];
        arraySum(arr, idx + 1, sum, ds);
    }

    public static void sortSum(int arr[],int idx ,int sum,ArrayList<Integer> ds){
        if(idx==arr.length){
            ds.add(sum);
            return;
        }
        
        sortSum(arr, idx+1, sum+arr[idx], ds);
        sortSum(arr, idx+1, sum, ds);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 1, 2 };
        ArrayList<Integer> ds = new ArrayList<>();
        arraySum(arr, 0, 0, ds);
        //sortSum(arr, 0, 0, ds);
        Collections.sort(ds);
        System.out.println(ds);
    }
}
