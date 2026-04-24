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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
       List<ListNode> list = new ArrayList<>();

       while(head != null){
         list.add(head);
         head = head.next ;
       } 

       Collections.reverse(list);
       ListNode node = new ListNode();
       ListNode temp = node;

       for(int i = 0 ; i < list.size() ; i++){
        ListNode x = list.get(i);
        temp.val = x.val;
        if(i == list.size() -1) break ;
        temp.next = new ListNode();
        temp = temp.next ;
       }

       return node ;
    }
}
