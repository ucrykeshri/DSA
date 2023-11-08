package Graphs;

import java.util.Arrays;


//Algorithm Steps:
// 1. Make a boolean visited[][] and set it to false
// 2. Traverse to all the nodes in the grid
//    2.1 At each node and first mark it visited
//    2.2 dfs() to all the adjacent nodes which is 1 or which is not visited
// 3. While traversing to all the nodes in the grid, run dfs at every node which is not visited and which is 1 and increase the cnt each time

public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(boolean i[]:visited){
            Arrays.fill(i,false);
        }
        int cnt=0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private void dfs(char[][] grid, int row, int col, boolean[][] visited){
        if(row<0 || row>=grid.length || col<0
                || col>=grid[0].length || grid[row][col] == '0' || visited[row][col])
            return;
        visited[row][col] = true;
        dfs(grid, row-1, col, visited);
        dfs(grid, row+1, col, visited);
        dfs(grid, row, col-1, visited);
        dfs(grid, row, col+1, visited);
    }
}
