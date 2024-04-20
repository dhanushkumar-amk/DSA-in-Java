package Arrays;

public class maxWealth1672 {
    public static void main(String[] args) {
        // System.out.println();
    }

    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        // A constant holding the minimum value an int can have, -231
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall answer

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
