import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class activitySelectionGreedy {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //end time basis
        /* 
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st Activity
        maxAct=1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i =0 ; i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        */
        //2d array approach
        int activities[][] = new int[start.length][3];
        for(int i =0 ; i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function -> short form
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        //end time basis sort
        ArrayList<Integer> ans = new ArrayList<>();
        //1st acivity
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("maxActivites="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
