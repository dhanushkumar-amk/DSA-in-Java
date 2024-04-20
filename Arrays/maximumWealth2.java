package Arrays;

public class maximumWealth2 {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum += accounts[i][j];
                // rowSum =0;
                // accounts[i][j] = 6

                // rowSum = 0 + 6
                // rowSum = 6;

                // again loop will run
                // accounts[i][j] = 10

                // rowSum = 6 + 10
                // rowSum = 16;

            }

            if (rowSum > max) {
                // initially maximum value is -231
                // rowSum 16
                // 16 > -231 condition is true
                // max = 16
                max = rowSum;

                // again loop will be run
            }
        }
        return max;
    }
}
