package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] person: accounts)
        {
            int rowSum = 0;
            for(int account: person)
            {
                rowSum += account;
            }
            
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
