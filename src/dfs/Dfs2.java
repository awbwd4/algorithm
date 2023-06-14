package dfs;

import java.util.Scanner;
import java.util.Stack;

public class Dfs2 {

    static final int MAX_N = 10;
    static int n; // 노드의 수
    static int m; // 간선의 수.
    static int[][] graph = new int[MAX_N][MAX_N];


    static void dfs(int node){
        boolean[] visited = new boolean[MAX_N];
        Stack<Integer> myStack = new Stack<>();

        myStack.push(node);


        while(!myStack.isEmpty()){

            int curr = myStack.pop();
            if (visited[curr]) continue;

            visited[curr] = true;
            System.out.println(curr + " ");

            for(int next = 0; next<n;next++){
                if(visited[next]) continue;
                if(graph[curr][next]!=1) continue;
                myStack.push(next);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //노드의 수
        n = sc.nextInt();
        //간선의 수
        m = sc.nextInt();

        //그래프 초기화(간선의 수만큼)
        for(int i = 0; i<m;i++){
            //노드들.
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = graph[v][u] = 1;

        }

        dfs(0);//0번 노드에서 시작.


    }



    
}
