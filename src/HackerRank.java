import java.util.ArrayList;
import java.util.Collections;

public class HackerRank {

    public static int hourglassSum(int[][] arr) {
        ArrayList<Integer> sum = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            for(int x = 0; x < 4; x++) {
                sum.add(subHourglassSum(arr, i, x));
            }
        }

        Collections.sort(sum);

        return sum.get(sum.size() - 1);
    }



    public static int subHourglassSum(int[][] arr, int r, int c) {
        int sum = 0;

        for(int i = c; i < c+3; i++) {
            sum += arr[r][i];
        }

        sum += arr[r+1][c+1];

        for(int i = c; i < c + 3; i++) {
            sum += arr[r + 2][i];
        }

        return sum;
    }
}
