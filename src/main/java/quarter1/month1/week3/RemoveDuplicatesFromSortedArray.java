package quarter1.month1.week3;

import java.util.Arrays;

/**
 * User: lihongxu
 * Date: 18/1/2
 * Time: 11:36
 * Comments  https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int i =0;
        while (i<nums.length){
            nums[k++] = nums[i];
            //skip the same
            while(i<nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
            i++;
        }
        return k;
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/11757
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int k = 0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[k]){
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/11757
     * @param nums
     * @return
     */
    public int removeDuplicates3(int[] nums) {
        int id = 1;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[i-1]){
                nums[id++] = nums[i];
            }
        }
        return id;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,4,4,5,5};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates3(nums));
    }
}
