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
        List<Integer> list = new ArrayList<>();
        
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    list.add(list1.val);
                    list1 = list1.next;
                } else {
                    list.add(list2.val);
                    list2 = list2.next;
                }
            } else if(list1 != null && list2 == null){
                list.add(list1.val);
                list1 = list1.next;
            } else if(list1 == null && list2 != null){
                list.add(list2.val);
                list2 = list2.next;
            }   
        }
        
        ListNode listNode = null;
        for(int i = list.size() - 1; i >= 0; i--){
            ListNode node = new ListNode(list.get(i), listNode);
            listNode = node;
        }
        
        return listNode;
    }
}