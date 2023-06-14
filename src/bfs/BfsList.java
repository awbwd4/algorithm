package bfs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //노드의 수
        int n = sc.nextInt();
        //간선의 수
        int m = sc.nextInt();
        //탐색을 시작할 정점의 번호
        int start = sc.nextInt();

        //방문여부 검사
        boolean visited[] = new boolean[n+1]; //번 노드 사용x

        //링크드리스트로 구현한다.
        LinkedList<Integer>[] adList = new LinkedList[n+1];

        for (int i = 0; i < n; i++) {// 노드마다의 링크드 리스트에 연결되어있는 다른 노드 정보가 있다.
            adList[i] = new LinkedList<Integer>();
            //노드마다 링크드리스트를 만들어준다.
        }

        // 두 정점 사이에 여러개의 간선이 있을 수 있다. 
        // 입력으로 주어지는 간선은 양방향이다.
        for(int i = 0; i<m; i++){//간선의 수만큼 반복하면서 노드와 노드간 연결을 해준다.
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adList[v1].add(v2);
            adList[v2].add(v1);
        }

        //방문순서를 위해 오름차순 정렬하자.
        for(int i = 0; i<n;i++){
            Collections.sort(adList[i]);
        }
        bfsList(start, adList, visited);
    }

    public static void bfsList(int start, LinkedList<Integer>[] adList, boolean[] visited){

        //큐를 사용할거다.
        Queue<Integer> myQueue = new LinkedList<Integer>();
        visited[start] = true;

        myQueue.add(start);

        while(!myQueue.isEmpty()){
            //큐가 모두 빌때까지 반복한다.
            int v = myQueue.poll(); //큐에서 맨 앞에 잇는것을 꺼내고
            System.out.println(v + " ");

            //해당 노드의 인접 노드들을 순회해야한다.

            Iterator<Integer> iter = adList[v].listIterator();
            while(iter.hasNext()){
                int w = iter.next(); //인접노드
                //방문한거면 패스
                //안한거면 그 노드 큐에 넣고
                //방문 체크
                if(!visited[w]){
                    myQueue.add(w);
                    visited[w] = true;
                }
            }
        }
    }
}
