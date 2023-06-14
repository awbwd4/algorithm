package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Maze3 {

    static int[] dx = {0,1,0,-1}; //가로방향
    static int[] dy = {1,0,-1,0}; //세로방향
    static int[][] A = new int[][]{
        {1,0,1,1,1,1},
        {1,0,1,0,1,0},
        {1,0,1,0,1,1},
        {1,1,1,0,1,1},
    };
    static boolean[][] visited = new boolean[4][6];
    static int N = 4;
    static int M = 6;// 4,6

    public static void main(String[] args) {

        // A = new int[][]{
        //     {1,0,1,1,1,1},
        //     {1,0,1,0,1,0},
        //     {1,0,1,0,1,1},
        //     {1,1,1,0,1,1},
        // };
        // visited = new boolean[4][6];


        BFS(0,0);
        System.out.println(A[N-1][M-1]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    static void BFS(int i, int j){
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[] {i,j}); // 첫 시작점을 큐에 넣어주기
        visited[i][j] = true;
        while(!queue.isEmpty()){
            
            int now[] = queue.poll();
            
            for(int k = 0; k<4;k++){//상하좌우 탐색
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];


                if (x < 0 || y < 0 || x >= N || y >= M) continue;
                if (A[x][y]==0 || visited[x][y]) continue;

                visited[x][y] = true;
                A[x][y] = A[now[0]][now[1]] + 1; //기존 맵에 거리 넣기
                queue.add(new int[]{x,y});

                // if(x >= 0 && y>=0 && x < N && y<M){ //배열을 넘기면 안됨
                //     if(A[x][y]!=0 && !visited[x][y]){ //0이어서 갈수없거나 기방문이면 안됨
                //         //이제 갈 수 있다는것
                //         visited[x][y] = true;
                //         A[x][y] = A[now[0]][now[1]] + 1; //기존 맵에 거리 넣기
                //         queue.add(new int[]{x,y});
                //     }
                // }

            }
        }        
    }
}
