package quarter1.month1.week4;

import java.util.List;

/**
 * User: lihongxu
 * Date: 18/1/22
 * Time: 11:42
 * Comments https://leetcode.com/problems/merge-two-sorted-lists
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode prev = ans;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                prev.next = l2;
                l2 = l2.next;
            } else{
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        if(l2 == null){
            prev.next = l1;
        } else {
            prev.next = l2;
        }
        return ans.next;
    }


    public static void main(String[] args) {
        ListNode l13 = new ListNode(5,null);
        ListNode l12 = new ListNode(3,l13);
        ListNode l1 = new ListNode(1,l12);


        ListNode l23= new ListNode(6,null);
        ListNode l22 = new ListNode(4,l23);
        ListNode l2 = new ListNode(2,l22);


        ListNode listNode = new MergeTwoSortedLists().mergeTwoLists(l2, l1);
        System.out.println(listNode);
    }
}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }
}
