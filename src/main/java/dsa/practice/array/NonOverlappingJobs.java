package dsa.practice.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NonOverlappingJobs {
    public static void main(String[] args) {
        int[] start = {1, 0, 3, 5, 8, 5};
        int[] end =   {2, 6, 4, 7, 9, 9};

        List<Job> result = countNonOver4lappingJobs(start, end);
        for(Job job: result){
            System.out.println("start: " + job.start+", End: "+job.end); // Output: 4
        }
        System.out.println("Total Jobs: " + result.size()); // Output: 4

    }

    private static List<Job> countNonOver4lappingJobs(int[] start, int[] end) {
        int n = start.length;
        List<Job> jobs = new ArrayList<>();
        for(int i=0; i<n; i++) {
            jobs.add(new Job(start[i], end[i]));
        }

        jobs.sort(Comparator.comparing(job -> job.end));

        int lastTime = -1;
        List<Job> result = new ArrayList<>();
        for(Job job: jobs){
            if(job.start >= lastTime) {
                lastTime = job.end;
                result.add(job);
            }
        }
        return result;
    }
}

class Job {
    int start, end;
    public Job(int start, int end){
        this.start = start;
        this.end = end;
    }
}
