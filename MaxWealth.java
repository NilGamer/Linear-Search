package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }

            if (rowSum > max) {
                max = rowSum;
            }
        }
        return max;
    }
}
