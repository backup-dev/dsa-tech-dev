import java.util.*;

public class CombinationSum {

    public static void possible(int arr[], int idx, int n, int target, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> ds) {
        if (idx == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            possible(arr, idx, n, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        possible(arr, idx+1, n, target, ans, ds);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,7,1};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        possible(arr, 0, arr.length, 7, ans, new ArrayList<>());
        System.out.println(ans);
    }
}


// Time Complexity (2^t)*(K)
// K here for transferring data to arraylist