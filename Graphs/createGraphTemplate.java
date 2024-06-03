import java.util.ArrayList;

public class createGraphTemplate {
    public static class edge {
        int src, dest;

        public edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(int[][] edges, ArrayList<edge>[] graph) {
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(new edge(edges[i][0], edges[i][1]));
            graph[edges[i][1]].add(new edge(edges[i][1], edges[i][0]));
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 1, 0 }, { 2, 0 } };
        int n = 3;
        ArrayList<edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(edges, graph);
        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
