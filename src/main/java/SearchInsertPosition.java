public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int index = -1;
        boolean indexFended = false;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            if (target <= nums[i]) {
                indexFended = true;
                break;
            }
        }
        if (!indexFended) {
            index = nums.length;
        }
        return index;
    }
}
