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
    public boolean hasCycle(ListNode head) {
       if(head == null) return false;
       if(head.next  == null) return false;
       ListNode slow = head.next ;
       if(slow.next == null) return false ;
       ListNode fast = slow.next ;

       while(slow != fast){
        if(slow.next == null) return false;
        slow = slow.next;
        if(fast.next == null) return false;
        if(fast.next.next == null) return false;
        fast = fast.next.next ;
       } 

       return true;
    }
}
