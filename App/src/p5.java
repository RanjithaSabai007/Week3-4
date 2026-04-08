public class p5 {

    // Linear Search
    static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target))
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].equals(target))
                return mid;
            else if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Count occurrences
    static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String s : arr)
            if (s.equals(target)) count++;
        return count;
    }
}