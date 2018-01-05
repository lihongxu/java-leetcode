package quarter1.month1.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
public class LongestSubstringwithAtMostKDistinctCharacters {

    public static int lengthOfLongestSubstringTwoDistinct(String s, int k) {
        int max = 0;
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            List<Byte> byteList = new ArrayList();
            int distinctNum = 0;
            int innerMax = 0;
            for (int j = i; j < bytes.length; j++) {
                if (byteList.contains(bytes[j])) {
                    byteList.add(bytes[j]);
                    innerMax++;
                }
                else {
                    if (distinctNum < k) {
                        byteList.add(bytes[j]);
                        distinctNum++;
                        innerMax++;
                    } else {
                        break;
                    }
                }
            }
            if (innerMax > max){
                max = innerMax;
            }
        }
        return max;
    }


    /**
     *
     https://www.jianshu.com/p/8a76feb7deef
     * @param s
     * @param k
     * @return
     */
    public static int lengthOfLongestSubstringTwoDistinct2(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        for (; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, i);
            if (map.size() > k) {
                int leftMost = Integer.MAX_VALUE;
                for (Character c : map.keySet()) {
                    leftMost = Math.min(leftMost, map.get(c));
                }
                map.remove(s.charAt(leftMost));
                j = leftMost + 1;
            }
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaaabbbbddccaddac";
        int k = 2;
        System.out.println(lengthOfLongestSubstringTwoDistinct(s, k));
    }
}
