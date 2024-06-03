
    /**
     * practicejava1
     */
    import java.util.*;
public class practicejava1 {
    public static class Job {
        char id; int deadline; int profit;
         // Make a constructor for adding element in job array :
         Job(char id, int deadline, int profit) {
            this.id = id; this.deadline = deadline; this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Job job[] = new Job[4];
        job[0] = new Job('a', 4, 20);
        job[1] = new Job('b', 1, 10);
        job[2] = new Job('c', 1, 40);
        job[3] = new Job('d', 1, 30);

        int ans = maxProfit(job);
        System.out.println(ans);
    }

    public static int maxProfit(Job job[]) {
        // Find the maximum deadline :
        int max_deadline = 0;
        for (int i = 0; i < job.length; i++) {
            max_deadline = Math.max(max_deadline, job[i].deadline);
        }

        char[] timeline = new char[max_deadline];
        // Arrays.fill(timeline,"");

        Arrays.sort(job,(job_a, job_b) -> (job_b.profit - job_a.profit));
        int profit = 0;
        for (int i = 0; i < job.length; i++) { /* Goes to every element :*/
            for (int j = job[i].deadline -1; j >= 0 ;j--) {
                if (timeline[j] == " ") {
                    profit += job[i].profit;
                    timeline[j] = job[i].id;
                    break;
                }
            }
        }
        for (int i = 0; i < job.length; i++) {
            if (timeline[i] != '*') {
                System.out.print(timeline[i]+" ");
            }
        }
        return profit;
    }
}