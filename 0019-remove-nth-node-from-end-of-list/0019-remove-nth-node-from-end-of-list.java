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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        int total = 0;
        while (current.next != null) {
            total++;
            current = current.next;
        }

        ListNode end = dummy;
        for (int i = 0; i < (total - n); i++) {
            end = end.next;
        }
        end = end.next.next;

        current = dummy;
        for (int i = 0; i < (total - n); i++) {
            current = current.next;
        }
        current.next = end;

        return dummy.next;
    }
}