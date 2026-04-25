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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ListNode current = head;
        while (current != null) {
            pq.add(current.val);
            current = current.next;
        }

        current = head;
        while (!pq.isEmpty()) {
            current.val = pq.poll();
            current = current.next;
        }

        return head;
    }
}