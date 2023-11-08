package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS_traversal {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>ans= new ArrayList<>();
        boolean vis[] =new boolean[V+1];
        Arrays.fill(vis,false);
        dfs(0,vis,adj,ans);
        return ans;
    }
    public ArrayList<Integer> dfs(int node,boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans)
    {
        ans.add(node);
        vis[node]=true;
        for(int i:adj.get(node))
        {
            if(vis[i]==false)
            {
                vis[i]=true;
                dfs(i,vis,adj,ans);
            }
        }
        return ans;
    }
}
