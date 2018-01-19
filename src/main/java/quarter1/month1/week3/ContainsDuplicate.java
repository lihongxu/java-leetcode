package quarter1.month1.week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 19:57
 * Comments
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    /**
     * https://leetcode.com/problems/contains-duplicate/discuss/61120
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        boolean flag=true;
        Set<Integer> numList=new HashSet<Integer>();
        for(int i=0;i<nums.length&&flag;i++){
            flag = numList.add(nums[i]);
        }
        return !flag;
    }

    public static void main(String[] args) {
        int[] nums ={1,3,5,7,9};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));

    }
}
