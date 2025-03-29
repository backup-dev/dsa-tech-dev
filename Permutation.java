import java.util.ArrayList;

public class Permutation {

    public static void recPerm(int arr[],ArrayList<Integer> ds,boolean flag[],ArrayList<ArrayList<Integer>> ans){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(flag[i]) continue;
            flag[i] = true;
            ds.add(arr[i]);
            recPerm(arr,ds, flag, ans);
            ds.remove(ds.size()-1);
            flag[i] = false;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean flag[] = new boolean[arr.length];
        recPerm(arr, new ArrayList<>(), flag, ans);
        System.out.println(ans);
    }
}
