package quarter1.month1.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringwithAtMostKDistinctCharacters {

    //暴力破解方法
    public static int lengthOfLongestSubstringAtMostKDistinct(String s, int k) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> charList = new ArrayList();
            int distinctNum = 0;
            for (int j = i; j < s.length(); j++) {
                if (charList.contains(s.charAt(j))) {
                    charList.add(s.charAt(j));
                }
                else {
                    if (distinctNum < k) {
                        charList.add(s.charAt(j));
                        distinctNum ++;
                    } else {
                        break;
                    }
                }
            }
            max = Math.max(max, charList.size());
        }
        return max;
    }


    /**
     * https://www.jianshu.com/p/8a76feb7deef
     *
     * @param s
     * @param k
     * @return
     */
    public static int lengthOfLongestSubstringAtMostKDistinct2(String s, int k) {
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
        System.out.println(lengthOfLongestSubstringAtMostKDistinct(s, k));
    }
}
