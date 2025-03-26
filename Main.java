import java.util.*;

public class Main {
  
  public static void firstSum(int[] a,int idx,ArrayList<Integer> arr,int sum,int target,int n ){
    if(idx==n){
      if(sum==target){
        System.out.println(arr);
      }
      return;
    }
    arr.add(a[idx]);
    sum = sum + a[idx];
    firstSum(a,idx+1,arr,sum,target,n);
    
    arr.remove(arr.size()-1);
    sum = sum-a[idx];
    firstSum(a,idx+1,arr,sum,target,n);
  }
    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<>();
      int[] a = new int[]{1,2,1};
      firstSum(a,0,arr,0,2,3);
  }
}
