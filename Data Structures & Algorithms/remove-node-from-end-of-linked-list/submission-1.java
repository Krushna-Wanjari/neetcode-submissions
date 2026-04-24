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
       int len = 0 ;
       if(head == null) return null ;

       ListNode node = head ;
       while(node != null){
        node = node.next ;
        len ++;
       }

       len = len - n;
       node = head;
       int idx = 0;

       while(idx < len){
         node = node.next ;
         idx ++;
       }

       ListNode tail = node.next;

       if(head == node) return tail;
       ListNode temp = head;

       while(temp.next != node){
        temp = temp.next;
       }
       temp.next = tail;
       return head ;

    }
}
