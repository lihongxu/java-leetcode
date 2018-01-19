package quarter1.month1.week3;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 * User: lihongxu
 * Date: 18/1/16
 * Time: 20:06
 * Comments https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    // k is less than 10
    public int[] plusK(int[] digits,int k) {
        int n = digits.length;
        int carry = 0;
        for(int i=n-1; i>=0; i--) {
            int sum = digits[i] + carry;
            if(i==n-1) {
                sum +=k;
            }
            if(sum < 10){
                digits[i] = sum;
                return digits;
            }
            else{
                carry = 1;
                digits[i] = sum%10;
            }
        }

        int[] newDigits = new int[n + 1];
        for (int i = 0; i <n ; i++) {
            newDigits[i+1]= digits[i];
        }
        newDigits[0]=1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits ={9,9,9};
        int[] ints = new PlusOne().plusK(digits, 9);
        System.out.println(ints);

        int[] ints1 = new PlusOne().plusOne(digits);
        System.out.println(ints1);
    }
}
