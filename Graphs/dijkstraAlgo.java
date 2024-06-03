import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstraAlgo {
    public static class edge {
        int src;
        int dest;
        int wt;

        public edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        graph[1].add(new edge(1, 3, 7));
        graph[1].add(new edge(1, 2, 1));
        graph[2].add(new edge(2, 4, 3));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));

    }

    public static class Info implements Comparable<Info> {
        int v, wt;

        public Info(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Info info2) {
            return this.wt - info2.wt;
        }

    }

    public static void dijstraAlgo(ArrayList<edge> graph[], int src, int dest) {
        int V = graph.length;
        int dist[] = new int[V];
        for (int i = 0; i <= dest; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        PriorityQueue<Info> pq = new PriorityQueue<>();
        pq.add(new Info(src, 0));
        while (!pq.isEmpty()) {
            Info curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    edge e = graph[curr.v].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Info(v, dist[v]));
                    }
                }
            }

        }
        for (int i : dist) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ArrayList<edge> graph[] = new ArrayList[6];
        createGraph(graph);
        dijstraAlgo(graph, 0, 5);

    }

}
