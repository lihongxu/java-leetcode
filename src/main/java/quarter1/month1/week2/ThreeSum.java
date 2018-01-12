package quarter1.month1.week2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: lihongxu
 * Date: 18/1/12
 * Time: 14:24
 * Comments https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();

        for (int i = 0; i <nums.length -2; i++) {
             int j = i+1;
             int k =nums.length -1 ;
             while ((i==0||nums[i] != nums[i-1])&&j<k){
                 if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                        while(j<k && nums[j] == nums[j+1]) j++;
                        while(j<k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                 }
                 else if (nums[i] + nums[j] + nums[k] > 0){
                        k--;
                 }
                 else{
                     j++;
                 }

             }
        }
        return lists;

    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(nums));
    }
}
