/**
 * ClassName: LeetCode203
 * Package: PACKAGE_NAME
 * Description: 移除链表元素
 *
 * @Author: Dust
 * @Create 2023/11/12 13:10
 * @Version 1.0
 */
public class LeetCode203 {
    public static void main(String[] args) {

    }

    /**
     * 移除链表元素
     *
     * @param head 链表头节点
     * @param val  待移除的元素值
     * @return 移除元素后的链表头节点
     */
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next; 
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
