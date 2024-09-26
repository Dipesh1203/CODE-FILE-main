import java.util.ArrayList;
import java.util.Queue;

public class createGraphTemplate {
    public static class edge {
        int src, dest;

        public edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraphUdirected(int[][] edges, ArrayList<edge>[] graph) {
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(new edge(edges[i][0], edges[i][1]));
            graph[edges[i][1]].add(new edge(edges[i][1], edges[i][0]));
        }
    }

    public void create(ArrayList<edge>[] graph, ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                graph[i].add(new edge(i, adj.get(i).get(j)));
            }
        }
    }

    public void dfs(ArrayList<edge>[] graph, int curr, boolean vis[], ArrayList<Integer> res) {
        if (vis[curr])
            return;
        vis[curr] = true;
        res.add(curr);
        for (int j = 0; j < graph[curr].size(); j++) {
            edge e = graph[curr].get(j);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, res);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<edge>[] graph = new ArrayList[V];
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[V];

        create(graph, adj);

        for (int i = 0; i < graph.length; i++) {
            dfs(graph, i, vis, res);
        }

        return res;
    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<edge>[] graph = new ArrayList[V];
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[V];

        create(graph, adj);

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            res.add(curr);

            for (edge e : graph[curr]) {
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }

        return res;
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
