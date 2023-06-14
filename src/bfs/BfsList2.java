package bfs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BfsList2 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //노드의 수
        int n = sc.nextInt();

        //간선의 수
        int m = sc.nextInt();
        //탐색을 시작할 정점의 번호
        int start = sc.nextInt();

        //방문여부
        boolean[] visited = new boolean[n];

        //링크드리스트로 구현
        LinkedList<Integer>[] adList = new LinkedList[n+1];

        for (int i = 0; i < n; i++) { //노드마다 링크드 리스트를 만들어줌
            adList[i] = new LinkedList<Integer>();
        }

        // 두 정점사이의 간선은 양방향이다.
        for(int i = 0; i<m;i++){//간선의 수
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adList[v1].add(v2);
            adList[v2].add(v1);
        }

        //방문순서를 위해 각 링크드 리스트를 오름차순으로 정렬해주자.
        for(int i = 0; i<n; i++){
            Collections.sort(adList[i]);
        }
        //돌리자
        // bfsList2(start, adList, visited);
        bfsList2(start, adList, visited);
    }
    
    public static void bfsList2(int start, LinkedList<Integer>[] adList, boolean[] visited) {
    
    //큐를 사용한다.
    Queue<Integer> myQueue = new LinkedList<Integer>();
    visited[start] = true;

    myQueue.add(start); //시작 노드를 큐에 넣는다.

    while(!myQueue.isEmpty()){//돌리자!

        int curr = myQueue.poll();// 큐에서 맨 앞의 것을 꺼내고
        System.out.println(curr + " ");

        //해당 노드의 링크드 리스트를 순회한다.
        Iterator<Integer> iter = adList[curr].listIterator();
        while(iter.hasNext()){
            int next = iter.next();// 다음노드
            // 방문 이미 한거면 패스
            // 안한거면 그 노드를 큐에 넣고
            // 방문처리
            if(!visited[next]){
                myQueue.add(next);
                visited[next] = true;
            }
        }
    }
    }
}
