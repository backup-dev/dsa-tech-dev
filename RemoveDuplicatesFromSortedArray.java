import java.util.Arrays;

class RemoveDuplicatesFromSortedArray {
    public static void removeDuplicates(int[] nums) {
        int write = 1;
        for (int i = 1; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            if (nums[i] != nums[i - 1]) {
                nums[write] = nums[i];
                write++;
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
    }

}
