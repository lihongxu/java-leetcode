package quarter1.month1.week2;

/**
 * User: lihongxu
 * Date: 18/1/5
 * Time: 10:58
 * Comments  206.https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur !=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode pre,ListNode cur) {

        if (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            return reverseList2(cur,next);
        }
        return pre;
    }



    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(null,"listNode3");
        ListNode listNode2 = new ListNode(listNode3,"listNode2");
        ListNode head = new ListNode(listNode2,"head");
        System.out.println(head);
        System.out.println(new ReverseLinkedList().reverseList(head));


        ListNode listNode5 = new ListNode(null,"listNode5");
        ListNode  listNode4 = new ListNode(listNode5,"listNode4");
        ListNode head2 = new ListNode(listNode4,"head2");
        System.out.println(new ReverseLinkedList().reverseList2(null,head2));
    }
}

class ListNode{
    public ListNode next;
    String value;

    public ListNode(ListNode next, String value) {
        this.next = next;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "next=" + next +
                ", value='" + value + '\'' +
                '}';
    }
}
