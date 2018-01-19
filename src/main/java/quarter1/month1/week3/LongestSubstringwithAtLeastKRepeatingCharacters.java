package quarter1.month1.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 20:06
 * Comments
 */
public class LongestSubstringwithAtLeastKRepeatingCharacters {

    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int max = 0;
        int[] count = new int[26];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        List<Integer> pos = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] < k) pos.add(i);
        }
        if (pos.size() == 0) return s.length();
        pos.add(0, -1);
        pos.add(s.length());
        for (int i = 1; i < pos.size(); i++) {
            int start = pos.get(i-1) + 1;
            int end = pos.get(i);
            int next = longestSubstring(s.substring(start, end), k);
            res = Math.max(res, next);
        }
        return res;
    }

    //https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/discuss/87768
    // python解法，言简意赅

    public static void main(String[] args) {
        String s = "ababbc";
        int k = 2;
        System.out.println(new LongestSubstringwithAtLeastKRepeatingCharacters().longestSubstring(s,k));

        List<Integer> list  = new ArrayList<Integer>();
        list.add(3);
        list.add(10);
        list.add(0,-1);
        list.add(20);
        System.out.println(list);
    }
}
