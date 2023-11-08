package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSort_BFS {

//    Algorithm:
//    Steps :
//            1. Make indegree[] and add indegree for all the vertices of the graph
//            2. Make a queue , A boolean visited[]
//            3. Add all the vertices of the graph in the queue which have indegree == 0
//            4. start popping elements from the queue and add it to your answer array
//                4.1 At every popping , check if the vertex is visited or not
//                if visited , check whether its adjacent node has indegree ==0
//                if indegree ==0 add it to the queue
//                else reduce the indegree by 1
//            5. finally return the ans array.

    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int ans[] = new int[V];
        int idx=0;
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[V];
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        Arrays.fill(indegree,0);
        for(ArrayList<Integer> list:adj) {
            for(int i:list){
                indegree[i]++;
            }
        }
        for(int i=0;i<indegree.length;i++) {
            if(indegree[i]==0){
                q.add(i);
                visited[i]=true;
            }
        }
        while(q.size()!=0) {
            int temp = q.poll();
            ans[idx++]=temp;
            for(int i:adj.get(temp)){
                if(!visited[i]){
                    indegree[i]--;
                }
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        return ans;
    }
}


