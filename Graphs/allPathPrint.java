import java.util.*;
public class allPathPrint {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
    } 
    public static void printAllPath(ArrayList<Edge> graph[],int src,int dest,String Path){
        if(src == dest){
            System.out.println(Path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, Path+src);
        }
    }
    public static void main(String args[]){

    }
}
