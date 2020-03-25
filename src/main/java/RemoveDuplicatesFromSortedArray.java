public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                len++;
            } else {
                System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
                i--;
            }
            if (nums[i] == nums[nums.length - 1]) {
                break;
            }
        }
        return len;
    }
}
