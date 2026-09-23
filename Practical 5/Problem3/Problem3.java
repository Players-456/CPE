import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 4},
            {3, 5},
            {6, 8}
        };

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int lastEnd = 0;

        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] >= lastEnd) {
                count++;
                lastEnd = intervals[i][1];
            }
        }

        System.out.println("Maximum talks = " + count);
    }
}