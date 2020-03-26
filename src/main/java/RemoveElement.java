import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int len = new RemoveElement().removeElement(nums, 2);
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
            if (i != len - 1) {
                System.out.print(" ,");
            } else {
                System.out.println("]");
            }
        }
    }

    public int removeElement(int[] nums, int val) {
        int len = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter == nums.length) {
                break;
            }
            if (nums[i] == val) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                i--;
            } else {
                len++;
            }
            counter++;
        }
        return len;
    }
}