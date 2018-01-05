package quarter1.month1.week1; /**
 * User: lihongxu
 * Date: 18/1/2
 * Time: 11:36
 * Comments
 */

/**
 * https://leetcode.com/problems/remove-element
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = 0;
        int i =0;
        int j =nums.length-1;

        while (i <= j) {
            while (i < nums.length && nums[i] != val && i <= j) {
                i++;
                length++;
            }
            while (j>=0 && nums[j] == val && i <= j) {
                j--;
            }

            if(i < nums.length && j >0 && i<j && nums[i]!=nums[j]) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return length;
    }

    /**
     * https://leetcode.com/problems/remove-element/discuss/12405
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement2(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0 ; i< len; ++i){
            while (nums[i]==val && i< len) {
                nums[i]=nums[--len];
            }
        }
        return len;
    }


    public static int removeElement3(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement3(nums,val));
    }
}


