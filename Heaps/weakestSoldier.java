import java.util.*;
public class weakestSoldier {
    static class rowCollection implements Comparable<rowCollection>{
        int idx;
        int sum;
        public rowCollection(int idx,int sum){
            this.idx = idx;
            this.sum = sum;
        }

        @Override
        public int compareTo(rowCollection r1){
            if(this.sum == r1.sum){
                return this.idx - r1.idx;
            }else{
                return this.sum-r1.sum;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                       };
        int k =2;
        PriorityQueue<rowCollection> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j]==1?1:0;
            }
            pq.add(new rowCollection(i,count));
        }
        for(int i=0 ;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
