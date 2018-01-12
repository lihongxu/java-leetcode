package quarter1.month1.week2;

/**
 * User: lihongxu
 * Date: 18/1/2
 * Time: 11:38
 * Comments https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length -1,target);
    }

    public int binarySearch(int[] nums,int start,int end,int target){
        if(start <= end ) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                return binarySearch(nums, start, mid - 1, target);
            }
            else if (nums[mid] < target) {
                return binarySearch(nums, mid + 1, end, target);
            }
            else {
                return mid;
            }
        }
        else {
            return start;
        }
    }


    public int searchInsert2(int[] nums, int target) {
        int i = 0;
        int j = nums.length -1 ;

        while (i<=j){
            int mid = (i + j) / 2;
            if (nums[mid] > target) {
                j = mid - 1;
            }
            else if (nums[mid] < target) {
                i = mid + 1;
            }
            else {
                return mid;
            }

        }
        return i;
    }

    /**
     * https://leetcode.com/problems/search-insert-position/discuss/15372
     * O(n)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(new SearchInsertPosition().searchInsert3(nums,target));
    }


}
