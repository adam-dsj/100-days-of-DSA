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
        int length = 0;
        ListNode cur = head;
        
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        if (n == length) {
            return head.next;
        }       
        // Now let's find the node before nthNode
        int target = length - n;
        ListNode prev = head;
        for (int i = 0; i<target-1; i++) {
            prev = prev.next;
        }
        
    prev.next = prev.next.next;
    return head;
    }
}