/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 == null) {
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                list1 = (list1.next != null) ? list1.next : null;
            } else if (list1 == null && list2 != null) {
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list2 = (list2.next != null) ? list2.next : null;
            } else {
                if (list1.val < list2.val) {
                    curr.next = new ListNode(list1.val);
                    curr = curr.next;
                    list1 = (list1.next != null) ? list1.next : null;
                } else {
                    curr.next = new ListNode(list2.val);
                    curr = curr.next;
                    list2 = (list2.next != null) ? list2.next : null;
                }
            }
        }
        return dummyHead.next;
    }
}