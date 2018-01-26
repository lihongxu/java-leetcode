package quarter1.month1.week4;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 20:06
 * Comments  https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        int sumN = ((0 + len) * (len + 1)) / 2; // sum = (n(a1+an))/2
        for (int num : nums) {
            sum += num;
        }
        return (sumN - sum);
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
