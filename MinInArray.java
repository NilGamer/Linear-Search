package LinearSearch;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 45, 53, 43, 1, 2, 9, 656 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
