package quarter1.month1.week1;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others
public class LargestNumberAtLeastTwiceofOthers {

    public static int dominantIndex(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
                boolean isDone = true;
                for(int j =0;j<nums.length;j++){
                    if (i!=j && nums[i]<nums[j]*2){
                        isDone = false;
                        break;
                    }
                }
                if(isDone){
                    return i;
                }
        }
        return -1;
    }

    /**
     * https://leetcode.com/problems/largest-number-at-least-twice-of-others/discuss/110118
     * @param nums
     * @return
     */
    public int dominantIndex2(int[] nums) {
        int maxOne = 0, maxTwo = 0, idx = 0;
        for(int i=0; i<nums.length; i++){
            if(maxOne < nums[i]){
                maxTwo = maxOne;
                maxOne = nums[i];
                idx = i;
            }
            else if(maxTwo < nums[i]){
                maxTwo = nums[i];
            }
        }
        return (maxOne>=maxTwo*2) ? idx : -1;
    }

    public static void main(String[] args) {
        int[] nums  = {3, 6, 1, 0};

        System.out.println(dominantIndex(nums));
    }

}
