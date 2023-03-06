public class Main {
    public static void main(String[] args) {


        int[][] arr = {{-9, -9, -9, 1, 1, 1},
                       {0, -9, 0, 4, 3, 2},
                       {-9, -9, -9, 1, 2, 3},
                       {0, 0, 8, 6, 6, 0},
                       {0, 0, 0, -2, 0, 0},
                       {0, 0, 1, 2, 4, 0},
        };

        System.out.println(HackerRank.hourglassSum(arr));
        System.out.println(HackerRank.subHourglassSum(arr, 1, 2));

    }

}
