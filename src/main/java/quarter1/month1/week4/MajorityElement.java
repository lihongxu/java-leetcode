package quarter1.month1.week4;

import java.util.Arrays;

/**
 * User: lihongxu
 * Date: 18/1/22
 * Time: 11:43
 * Comments https://leetcode.com/problems/majority-element
 * 投票算法，因为符合的众数总是存在。所以没出现一对不一样的就可以忽视这一对。
 * 我们可以用计数表示，来一个数字，如果和candidate相同那么count++，
 * 否则count--，如果count为零了，那么candidate就是下一个数。最后candidate就是众数了。
 */
public class MajorityElement {

    // n
    public int majorityElement(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    // nlogn
    public int majorityElementw(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len/2];
    }
}
