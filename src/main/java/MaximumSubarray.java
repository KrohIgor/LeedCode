public class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = {3, -2, -3, -3, 1, 3, 0};
        System.out.println(new MaximumSubarray().maxSubArray(array));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int element : nums) {
            sum += element;
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
