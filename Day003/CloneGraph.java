package CloneGraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
	
	class Solution {
	    Map<Node, Node> map = new HashMap<>();
	    public Node cloneGraph(Node node) {
	        if (node == null) {
	            return null;
	        }
	        Node cur = new Node(node.val);
	        map.put(node, cur);
	        for (Node neighbor : node.neighbors) {
	            if (!map.containsKey(neighbor)) {
	                cloneGraph(neighbor);
	            }
	                cur.neighbors.add(map.get(neighbor));
	        }
	        return cur;
	        
	    }
	}

}
