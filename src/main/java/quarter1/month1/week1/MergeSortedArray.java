package quarter1.month1.week1;

/**
 * User: lihongxu
 * Date: 18/1/4
 * Time: 17:28
 * Comments https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m -1 ;
        int j = n -1 ;
        int k = m + n - 1;

        while (i >=0 && j >=0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }
    }


    //both a and b is ascend. MergeSort nlogn  空间On
    public void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while (i<=a.length && j<=b.length){
            if (a[i]<=b[i]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while (i<=a.length){
            c[k++]=a[i++];
        }
        while (j<=b.length){
            c[k++]=b[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 2;
        nums1[1] = 7;
        nums1[2] = 8;

        int[] nums2 = {1,9};

        merge(nums1,3,nums2,2);

        for (int i : nums1) {
            System.out.println(i);
        }

    }
}
