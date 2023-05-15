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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        
       
        ListNode node1 = head;
        for (int i = 1; i < k; i++) {
            node1 = node1.next;
        }
        
        
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        ListNode node2 = head;
        while (fast != null) {
            node2 = node2.next;
            fast = fast.next;
        }
        
        
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        
        return head;
    }
}
