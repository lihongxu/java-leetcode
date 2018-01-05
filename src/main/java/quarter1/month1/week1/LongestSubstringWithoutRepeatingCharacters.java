package quarter1.month1.week1;

import java.util.HashSet;

/**
 * User: lihongxu
 * Date: 18/1/3
 * Time: 10:16
 * Comments
 * http://blog.csdn.net/han_xiaoyang/article/details/11969497
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcdaabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s){
        int max =0;
        byte[] chars = s.getBytes();
        for (int i = 0; i < chars.length; i++) {
            HashSet<Byte> set = new HashSet<Byte>();
            for (int j = i;j< chars.length;j++){
                    if (!set.contains(chars[j])){
                        set.add(chars[j]);
                    }
                    else{
                        break;
                    }
            }
            if(set.size() > max){
                max = set.size();
            }
        }
        return max;
    }
}
