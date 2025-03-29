import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumII {

    // T.C --> 2^N * N; (Total no of elements and moving those elements into the ds )
    // S>C --> 2^N * K; (Total no of elements and avg size of k)

    public static void unqSet(int[] arr,int idx,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans){

        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            unqSet(arr, i+1, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,1,1,2,2,2};
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        unqSet(arr, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }
}
