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
    public void reorderList(ListNode head) {
      if(head == null || head.next == null) return ;
      
       int len = 0;
       ListNode node = head;

       while(node != null){
        len++;
        node = node.next;
       }
       node = head;
       int size = len ;

       //check len is odd or even:
       if(len % 2 == 0) len = len/2;
       else len = len/2 + 1 ;

       Queue<Integer> leftq = new LinkedList<>();
       Queue<Integer> rightq = new LinkedList<>();
       int idx = 0;

       while(idx < len ){
         leftq.add(node.val);
         node = node.next ;
         idx++;
       }

       while(idx <= size && node != null){
        rightq.add(node.val);
        node = node.next;
        idx++;
       }

       //reverse the rightqueue;
       List<Integer> list = new LinkedList<>(rightq);
       Collections.reverse(list);
       rightq.clear();
       rightq.addAll(list);

       Queue<Integer> q = new LinkedList<>();
       while(!rightq.isEmpty()){
        q.add(leftq.poll());
        q.add(rightq.poll());
       }

       while(!leftq.isEmpty()){
        q.add(leftq.poll());
       }

       node = head;
       while(!q.isEmpty()){
        node.val = q.poll();
        node = node.next;
       }

       return;

    }
}
