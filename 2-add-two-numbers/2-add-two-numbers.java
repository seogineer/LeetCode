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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int carry = 0;
        while(l1 != null || l2 != null){
            int value1 = 0;
            int value2 = 0;
            
            if(l1 != null){
                value1 = l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                value2 = l2.val;
                l2 = l2.next;
            }
            
            list.add( (value1 + value2 + carry) % 10 );
            carry = (value1 + value2 + carry) / 10;
        }
        
        if(carry != 0){
            list.add(carry);
        }
        
        ListNode resultNode = null;
        for(int i = list.size() - 1; i >= 0; i--){
            ListNode node = new ListNode(list.get(i), resultNode);
            resultNode = node;
        }
        
        return resultNode;
    }
}