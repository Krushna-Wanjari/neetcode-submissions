/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      if(head == null) return null;
       Node out = new Node(head.val) ;
       Node temp = out;
       Node data = head ;
       Map<Node ,Node > map = new HashMap<>();
       map.put(null , null);

       while(head != null){
         temp.val = head.val ;
         map.put(head , temp);

         if(head.next == null) break;
         temp.next = new Node(0);
         temp.random = null;

         temp = temp.next ;
         head = head.next ; 
       } 

       temp = out ;
       head = data ;

       while(temp != null){
        temp.random = map.get(head.random);
        head = head.next;
        temp = temp.next ;
       }

       return out ;
    }
}
