/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * } solve using two pointers
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy node to handle edge case (delete head)//
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //Two Pointers
        ListNode fast = dummy;
        ListNode slow = dummy;

        //move fast n step ahead
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        //move until fast reaches last node
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //dlt the nth node from the end
        slow.next = slow.next.next;
        //return new head (skip dummy)
        return dummy.next;


        
    }
}