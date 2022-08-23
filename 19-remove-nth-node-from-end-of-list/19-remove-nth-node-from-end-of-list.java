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
        ListNode leader = head;
        ListNode follower = head;
        
        for(int i = 0; i < n; i++){
            leader = leader.next;
        }
        
        if(leader == null){
            return head.next;
        }
        
        while(leader.next != null){
            leader = leader.next;
            follower = follower.next;
        }
        
        follower.next = follower.next.next;
        
        return head;
    }
}