import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class CombinationSumII {
    public static void possible(int arr[], int idx, int n, int target,
            Set<ArrayList<Integer>> ans,
            ArrayList<Integer> ds) { // Time Complexity (2^n)*(K*log(setSize))
        if (idx == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            possible(arr, idx + 1, n, target - arr[idx], ans, ds);
            ds.remove(ds.size() - 1);
        }
        possible(arr, idx + 1, n, target, ans, ds);
    }

    public static void possibleOpt(int arr[], int idx, int target, int n, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < n; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            ds.add(arr[i]);
            possibleOpt(arr, i + 1, target - arr[i], n, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 2, 2 };
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        possibleOpt(arr, 0, 4, arr.length, ans, new ArrayList<>());
        System.out.println(ans);
    }
}
