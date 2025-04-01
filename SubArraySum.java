public class SubArraySum {

    
    public static int bruteSubArray(int arr[],int target){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            int sum = 0;
            for(int j=i+1;j<arr.length;j++){
                sum += arr[i]+arr[j];
                if(sum==target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int arr[] = new int[]{1,1,-1,1,2,3,5};
        System.out.println(bruteSubArray(arr, 2));
    }
}
