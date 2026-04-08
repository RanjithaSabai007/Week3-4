public class p6 {

    // Linear Search
    static boolean linearSearch(int[] arr, int target) {
        for (int x : arr)
            if (x == target) return true;
        return false;
    }

    // Floor
    static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                res = arr[mid];
                low = mid + 1;
            } else high = mid - 1;
        }
        return res;
    }

    // Ceiling
    static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                res = arr[mid];
                high = mid - 1;
            } else low = mid + 1;
        }
        return res;
    }
}