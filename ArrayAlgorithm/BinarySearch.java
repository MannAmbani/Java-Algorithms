package ArrayAlgorithm;

public class BinarySearch {
    // Binary search only works when the array is sorted in accending order
    // if the data is not sorted then we have to sort data which sometimes increases
    // time complexity

    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            System.out.println("one mid:- " + mid + " max- " + max + " min- " + min + " arr of mid " + arr[mid]);
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            System.out.println("two mid:- " + mid + " max- " + max + " min- " + min + " arr of mid " + arr[mid]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 10));

    }
}
