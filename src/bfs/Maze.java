package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int col, row;
    public Point(int col, int row){
        this.col = col;
        this.row = row;
    }

}

public class Maze {
    
    
    static int[][] D = {{-1,0},{1,0}, {0,-1}, {0,1}};
    static int[][] array; // 미로
    static int[][] dis; // 거리 저장
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // array = new int[8][8];
        dis = new int[8][8]; //0행, 0열은 쓰지 않는다.

        // for(int i = 0;i<=7;i++){
        //     for(int j = 0;j<=7;j++){
        //         array[i][j] = sc.nextInt();
        //     }
        // }

        array = new int[][]{
            {0,0,0,0,0,0,0,0},
            {0, 0,0,0,0,0,0,0},
            {0, 0,1,1,1,1,1,0},
            {0, 0,0,0,1,0,0,0},
            {0, 1,1,0,1,0,1,1},
            {0, 1,1,0,1,0,0,0},
            {0, 1,0,0,0,1,0,0},
            {0, 1,0,1,0,0,0,0}
        };



        System.out.println("===============");
        BFS(1, 1); //(1,1) 이 시작점.
        System.out.println("===============");
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);

        for(int i = 0 ; i<dis.length;i++){
            for(int j = 0;j<dis.length;j++){
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void BFS(int col, int row){

        Queue<Point> myQueue = new LinkedList<>();

        myQueue.add(new Point(col, row)); // 첫번째 위치를 큐에 넣기
        array[col][row] = 1;//출발점 체크, 내가 갔던 경로임. 갔던 경로는 되돌아가지 않는다.

        System.out.println("1");
        while(!myQueue.isEmpty()){
            System.out.println("2");

            Point curr = myQueue.poll();// 큐에서 현재위치 꺼내기

            for(int i=0;i<4;i++){// 네방향으로 확인

                int nextCol = curr.col+D[i][0];
                int nextRow = curr.col+D[i][1];

                // // 그 후 이동 가능 경로 확인.
                if (nextCol < 1 || nextCol > 7 || nextRow < 1 || nextRow >7) continue;
                if (array[nextCol][nextRow] != 0) continue;
                
                array[nextCol][nextRow]=1;
                dis[nextCol][nextRow] = dis[curr.col][curr.row] +1;
                myQueue.add(new Point(nextCol, nextRow));
                
                
                // if(nextCol>=1 && nextCol <=7 && nextRow >= 1 && nextRow <=7 && array[nextCol][nextRow]==0){
                // }



            }
        }
    }








}
