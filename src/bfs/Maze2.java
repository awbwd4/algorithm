package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze2 {

    static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};// 행 열
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] map = new int[][]{
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,1},
            {0,0,0,0,1}
        };

        int[][] visited = new int[n][n];
        
        bfsMaze(0,0, map, visited);

        int answer = visited[4][4];

        if (answer>0) System.out.println(answer);
        else System.out.println("-1");
        ;


    }

    static void bfsMaze(int row, int col, int[][] map, int[][] visited) {

        Queue<int[]> queue = new LinkedList<>();
        visited[row][col] = 1;
        queue.add(new int[]{col,row});

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int currRow = curr[0];
            int currCol = curr[1];

            for(int i=0;i<4;i++){
                int nextRow = currRow+D[i][0];
                int nextCol = currRow+D[i][1];
            
                if(nextRow < 0 || nextRow >= 5 ||  nextCol < 0 || nextCol >= 5) continue;
                if(visited[nextRow][nextCol] == 0 && map[nextRow][nextCol]==1){
                    queue.add(new int[]{nextRow,nextCol});
                    visited[nextRow][nextCol] = visited[currRow][currCol]+1;
                }
            
            
            
            }








        }








    }







}
