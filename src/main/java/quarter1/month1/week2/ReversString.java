package quarter1.month1.week2;

/** 
 * @description:一句话描述方法作用 
 * @param:https://leetcode.com/problems/reverse-string/description/ 
 * @throws:
 * @author: lihongxu
 * @date: 18/1/9 14:55
 */
public class ReversString {

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j){
            char tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }
        return new String (chars);

    }


    public static void main(String[] args) {
       String s = "hello2234goodperfect";
       System.out.println(new ReversString().reverseString(s));
    }


}
