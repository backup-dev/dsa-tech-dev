import java.util.ArrayList;

// Print the first occurrence if sum is equal to target

public class CountOccurenceSum {

    public static int count(int arr[],int idx,int sum,int target,ArrayList<Integer> ds){
        if(idx==arr.length){
            if(target == sum){
                System.out.println(ds);
                return 1;
            }
            return 0;
        }
        ds.add(arr[idx]);
        sum = sum + arr[idx];
        int l = count(arr, idx+1,sum,target, ds);
        ds.remove(ds.size()-1);
        sum = sum - arr[idx];
        int r = count(arr, idx+1,sum,target, ds);

        return l+r;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        ArrayList<Integer> ds = new ArrayList<>();
        int result = count(arr, 0,0, 5,ds); 
          System.out.println(result);
    }
}
