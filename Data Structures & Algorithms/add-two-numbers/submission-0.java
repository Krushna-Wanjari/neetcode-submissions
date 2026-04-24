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
       StringBuilder s1 = new StringBuilder(); 
       StringBuilder s2 = new StringBuilder(); 

       while(l1 != null){
        s1.append(l1.val);
        l1 = l1.next ;
       }
       while(l2 != null){
        s2.append(l2.val);
        l2 = l2.next ;
       }

       s1 = s1.reverse();
       s2 = s2.reverse();
       int sum = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString()) ;
       String s = String.valueOf(sum);
       s = new StringBuilder(s).reverse().toString();

       Queue<Integer> queue = new LinkedList<>();
       for(char x : s.toCharArray()){
        queue.add(x- '0');
       }

       ListNode node = new ListNode();
       ListNode temp = node;

       while(!queue.isEmpty()){
        temp.val = queue.poll();
        if(queue.isEmpty()) break;

        temp.next = new ListNode();
        temp = temp.next;
       }

       return node ;

    }
}
