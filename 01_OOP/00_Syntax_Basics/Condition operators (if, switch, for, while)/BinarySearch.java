public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 2;
        System.out.println(searchBinary(array, element));
    }

    private static int searchBinary(int[] array, int element) {
        int left = 0;
        int right = array.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                right = mid - 1;
            }

        System.out.println("mid = " + mid);
        }
        return 0;
    }
}
