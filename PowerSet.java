import java.util.ArrayList;

public class PowerSet {

    public static void printSubset(int arr[],int idx,ArrayList<Integer> ds){
        if(idx==arr.length){
            System.out.println(ds);
            return;
        }
        //Pick condition
        ds.add(arr[idx]);
        printSubset(arr, idx+1, ds);
        ds.remove(ds.size()-1);
         
        //Not pick condition
        printSubset(arr, idx+1, ds);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        printSubset(arr, 0, new ArrayList<>());   
    }
}
