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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists.length == 0) return null;
     ListNode parent = lists[0] ;
     if(parent == null && lists.length == 1) return null ;

     for(int i = 1 ; i < lists.length ; i++){
       parent = merge(parent , lists[i]) ;
     }

     return parent;
    }

    public ListNode merge( ListNode a , ListNode b){
      if(a==null && b== null) return null ;
      if(a == null && b != null) return b;
      if(b == null && a != null) return a ;
      
      ListNode head = new ListNode();
      ListNode node = head;

      while(a != null && b != null){

        if(a.val >= b.val){
          node.val = b.val ;
          b = b.next;
        }else{
          node.val = a.val;
          a = a.next ;
        }

        if(a == null || b == null) break;
        node.next = new ListNode();
        node = node.next ;
      }

      if(a != null) node.next = a ;
      if(b != null) node.next = b ;

      return head ;
    } 
}
