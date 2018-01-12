package quarter1.month1.week2;

import java.util.Arrays;

/**
 * User: lihongxu
 * Date: 18/1/12
 * Time: 16:11
 * Comments https://leetcode.com/problems/3sum-closest/description/
 */
public class ThreeSumCloset {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i <nums.length -1 ; i++) {
            int left = i + 1;
            int right = nums.length -1;
            while (left < right){
                int val  = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - val) < Math.abs(target - ans)){
                    ans = val;
                }
                if (val < target){
                    left++;
                }
                else if (val >target){
                    right--;
                }
                else{
                    return  ans; //如果不判断相等的话 leetcode会判定超时
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {-1,2,1,-4};
        int[] nums = {0,1,2};
        int target = 1;
        System.out.println(new ThreeSumCloset().threeSumClosest(nums,target));
    }
}
