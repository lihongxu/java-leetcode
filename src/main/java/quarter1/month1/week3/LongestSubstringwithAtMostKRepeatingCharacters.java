package quarter1.month1.week3;

import java.util.HashMap;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 20:06
 * Comments
 */
public class LongestSubstringwithAtMostKRepeatingCharacters {

    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> indexMap = new HashMap<Character,Integer>();
        int max =0;
        for (int i = 0,j=0; i < s.length() ; i++) {
            if(countMap.get(s.charAt(i))!=null && countMap.get(s.charAt(i))>=k){
                j = Math.max(j,indexMap.get(s.charAt(i))+1);
            }
            //Set countMap.
            if(countMap.get(s.charAt(i))!=null) {
                countMap.put(s.charAt(i),countMap.get(s.charAt(i))+1);
            }
            else{
                countMap.put(s.charAt(i),1);
            }

            indexMap.put(s.charAt(i), i);
            max = Math.max(max,i-j+1);
        }
        return max;

    }

    public static void main(String[] args) {
        String s = "abbabbc";
        int k = 3;
        System.out.println(new LongestSubstringwithAtMostKRepeatingCharacters().longestSubstring(s,k));
    }
}
