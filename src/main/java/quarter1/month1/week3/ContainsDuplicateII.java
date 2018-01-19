package quarter1.month1.week3;

import java.util.HashMap;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 20:05
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 * Comments
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }

    public static void main(String[] args) {
            int[] nums = {1,2,4,1,6};
            int k = 3;
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums,k));
    }

}
