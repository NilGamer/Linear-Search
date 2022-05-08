package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 34, 45 },
                { 4, 9, 3, 23 },
                { 45, 43, 2, 1 },
                { 56, 7 }
        };

        int target = 3;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max value is : " + max(arr));
    }

    // Search element and return index if got
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // find max value in the 2d array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
