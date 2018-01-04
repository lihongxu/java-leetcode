import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 * User: lihongxu
 * Date: 18/1/2
 * Time: 11:36
 * Comments
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                sum[0]=i;
                sum[1]=map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return sum;
    }

    /**
     * https://leetcode.com/problems/two-sum/discuss/3
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ans = new TwoSum().twoSum(nums, 9);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
