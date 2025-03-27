import java.util.ArrayList;

// Print the first occurrence if sum is equal to target

public class FirstOccurenceSum {

    public static  Boolean printSubset(int arr[],int idx,int sum,int target,ArrayList<Integer> ds){
        if(idx==arr.length){
            if(target == sum){
                System.out.println(ds);
                return true;
            }
            return false;
        }
        ds.add(arr[idx]);
        sum = sum + arr[idx];
        if(printSubset(arr, idx+1,sum,target, ds)==true) return true;
        ds.remove(ds.size()-1);
        sum = sum - arr[idx];
        if(printSubset(arr, idx+1,sum,target, ds)==true) return true; 

        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        ArrayList<Integer> ds = new ArrayList<>();
        printSubset(arr, 0,0, 3,ds);   
    }
}
