import java.util.*;
import java.util.LinkedList;

public class BFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 6));
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 6));
        // graph[4].add(new Edge(4, 5));
        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
        graph[6].add(new Edge(6, 2));
        graph[6].add(new Edge(6, 4));
    }

    public static void bfs(ArrayList<Edge>[] graph) {// O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph, 0, new boolean[V]);
        System.out.println();
        bfs(graph);
    }
}
