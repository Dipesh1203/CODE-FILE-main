import java.util.*;
import java.util.LinkedList;

public class practiceJava {
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

    public static boolean dfs(ArrayList<edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (dfsUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (dfsUtil(graph, vis, e.dest, curr))
                    return true;
            } else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBiapartite(ArrayList<edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        int col[] = new int[V];
        for (int i : col) {
            i = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            col[e.dest] = col[curr] == 0 ? 1 : 0;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static long largestPerimeter(int[] nums) {
        int n = nums.length;
        long sumarray[] = new long[n];
        Arrays.sort(nums);
        sumarray[0] = (long) nums[0];
        for (int i = 1; i < n; i++) {
            sumarray[i] = sumarray[i - 1] + nums[i];
            System.out.print(sumarray[i] + " | ");
        }
        System.out.println();
        if (n == 3) {
            if (nums[n - 1] > (sumarray[n - 2])) {
                return -1;
            } else {
                return sumarray[2];
            }
        }
        for (int i = 3; i < n; i++) {
            if (!(sumarray[i - 1] > nums[i])) {
                System.out.println(sumarray[i - 1] + " | " + nums[i]);
                System.out.println();
                return sumarray[i - 1];
            }
        }
        return -1;
    }

    public static void printArr(ArrayList<Integer> arr) {
        for (Integer i : arr) {
            System.out.print(i + " | ");
        }
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        // int arr[]
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : hm.keySet()) {
            res.add(hm.get(i));
        }
        printArr(res);
        System.out.println();
        Collections.sort(res);
        int l = 0;
        printArr(res);
        System.out.println();
        while (l < res.size()) {
            if (res.get(l) > 0) {
                res.set(l, res.get(l) - 1);
                k--;
            } else if (res.get(l) == 0) {
                res.remove(l);
            }
            l++;
        }
        printArr(res);
        return res.size();

    }

    public static int[] returnMax(int strength[], int location[], int n, int k) {
        int arr[] = new int[n];
        for (int i = 0; i < location.length; i++) {
            arr[location[i] - 1] = strength[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i == 0) {
                    int temp = arr[i] - 1;
                    int h = 1;
                    while (temp > 0 && h + i < arr.length) {
                        arr[i + h] = Math.max(arr[i + h], temp);
                        temp--;
                        h++;
                    }
                } else if (i == arr.length - 1) {
                    int temp = arr[i] - 1;
                    int h = 1;
                    while (temp > 0 && i - h > 0) {
                        arr[i - h] = Math.max(arr[i - h], temp);
                        temp--;
                        h++;
                    }
                } else {
                    int j = 1;
                    int temp = arr[i] - 1;
                    while (temp > 0 && i + j < arr.length && i - j > 0) {
                        arr[i - j] = Math.max(arr[i - j], temp);
                        arr[i + j] = Math.max(arr[i + j], temp);
                        j++;
                        temp--;
                    }
                }

            }
        }
        return arr;
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
        for (int i = 0; i < dest; i++) {
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