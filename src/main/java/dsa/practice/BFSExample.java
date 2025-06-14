package dsa.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSExample {
    public void bfs(int nodes, List<List<Integer>> adjList, int start) {
        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for (int neighbor : adjList.get(node)) {
                if(!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0; i< nodes ; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1); adjList.get(0).add(2);
        adjList.get(1).add(0); adjList.get(1).add(3); adjList.get(1).add(4);
        adjList.get(2).add(0); adjList.get(2).add(4);
        adjList.get(3).add(1);
        adjList.get(4).add(1); adjList.get(4).add(2);

        BFSGraph bfs = new BFSGraph();
        System.out.println("BFS starting from node 0:");
        bfs.bfs(0, adjList, nodes); // Output: 0 1 2 3 4
    }
}
