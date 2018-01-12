package quarter1.month1.week2;

/**
 * User: lihongxu
 * Date: 18/1/4
 * Time: 11:18
 * Comments
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1,4,6,7,9,11,12};
        int[] arry2  ={2,4,6,8};
        int[] merge = merge(array1, arry2);
        System.out.println(merge);
    }

    public static int[] merge(int[] array1,int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]){
                result[k++] = array1[i++];
            }
            else{
                result[k++] = array2[j++];
            }
        }

        while (i < array1.length){
            result[k++] = array1[i++];
        }


        while (j < array2.length){
            result[k++] = array2[j++];
        }

        return result;
    }

}
