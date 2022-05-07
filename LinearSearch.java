package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 11, 3, 34, 8, 54, 67, 44 };
        int target = 3;

        int ans = linSearch(nums, target);
        System.out.println(target + " index is " + ans);
    }

    // search in the array and return index if item found otherwise return -1
    static int linSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
