import java.util.ArrayList;

public class PermutationII {

    // T.C --> O(N!*N)
    // S.C --> O(N!) + O(N)

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void recPer(int arr[],int idx,ArrayList<ArrayList<Integer>> ans){
        if(idx==arr.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=idx;i<arr.length;i++){
           swap(arr,i,idx);
           recPer(arr, idx+1, ans);
           swap(arr,i,idx);
        }
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        recPer(arr, 0, ans);
        System.out.println(ans);
    }
    
}
