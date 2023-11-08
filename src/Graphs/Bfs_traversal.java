package Graphs;

import java.util.*;
public class Bfs_traversal {
        // Function to return Breadth First Traversal of given graph.
        public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

            ArrayList<Integer>ans = new ArrayList<>();
            boolean vis[] = new boolean[V];
            Arrays.fill(vis,false);

            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            vis[0]=true;
            while(!q.isEmpty()) {
                int temp = q.poll();
                ans.add(temp);
                for(int j:adj.get(temp))
                {
                    if(vis[j]==false)
                    {
                        vis[j]=true;
                        q.add(j);
                    }
                }
            }
            return ans;
        }
}

