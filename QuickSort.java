import java.util.Arrays;

class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partitionIdx(arr, low, high);
            quick(arr, low, pidx - 1);
            quick(arr, pidx + 1, high);
        }
    }

    public static int partitionIdx(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low,j);
        System.out.println(Arrays.toString(arr));
        return j;
    }

    public static void main(String args[]) {
        //int nums[] = new int[] { 4, 6, 2, 5, 7, 9, 1, 3 };
        int nums[] = new int[] {9,8,7,6,5,4,3,2,1,0};
        quick(nums, 0, nums.length - 1);
        // System.out.println(Arrays.toString(nums));
    }
}
