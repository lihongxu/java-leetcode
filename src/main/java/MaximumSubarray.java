/**
 * User: lihongxu
 * Date: 18/1/2
 * Time: 11:36
 * Comments
   https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];

            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }



    //https://leetcode.com/problems/maximum-subarray/discuss/20211

    public static int maxSubArray2(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }


    /**
     * https://leetcode.com/problems/maximum-subarray/discuss/20193
     */

    public int maxSubArray3(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }


}
