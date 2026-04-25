/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null ;
       Node out = new Node() ;
       Set<Node> set1 = new HashSet<>();
       Set<Node> set2 = new HashSet<>();

       Queue<Node> queue = new LinkedList<>();
       queue.add(node);
       set1.add(node);
       set2.add(node);

       Map<Node,Node> map = new HashMap<>();

       while(!queue.isEmpty()){
         int siz = queue.size();

         for(int i = 0 ; i < siz ; i++){
           Node temp = queue.poll();
           Node x = new Node();
           x.val = temp.val;
           map.put(temp , x);

           for(Node n : temp.neighbors){
            if(!set1.contains(n)){
               queue.add(n) ;
               set1.add(n);
            } 
           }
         }

       }

       queue.add(node);

         while(!queue.isEmpty()){
            int siz = queue.size();

            for(int i = 0 ; i < siz ; i++){
                Node x = queue.poll();
                List<Node> list = new ArrayList<>();

                for(Node n : x.neighbors){
                    list.add(map.get(n));
                    if(!set2.contains(n)){
                       queue.add(n) ;
                       set2.add(n);
                    } 

                }
                map.get(x).neighbors = list ;
            }

         }
       
       return map.get(node) ;
    }
}