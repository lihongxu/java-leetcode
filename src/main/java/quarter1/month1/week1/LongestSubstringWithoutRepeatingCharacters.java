package quarter1.month1.week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

        String s2 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s2));
    }

    //O(n^2)-暴力破解
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

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1812
    public int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<Character>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729/
    public int lengthOfLongestSubstring3(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
