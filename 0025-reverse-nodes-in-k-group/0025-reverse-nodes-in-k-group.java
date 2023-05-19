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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 0 || k == 1) {
            return head;
        }

        ListNode curr = head;
        ListNode prevGroupTail = null;
        
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        curr = head;
        ListNode prev = null;
        ListNode next = null;
        count = 0;
        
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        if (prevGroupTail != null) {
            prevGroupTail.next = prev;
        }
        
        return prev;
    }
}
