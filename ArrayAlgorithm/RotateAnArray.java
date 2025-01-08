package ArrayAlgorithm;

import java.util.Arrays;

public class RotateAnArray {

    public static void rotateArray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

    }

    public static int[] rotateArrayWithArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            res[i - 1] = arr[i];
        }
        res[arr.length - 1] = arr[0];
        return res;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        // rotateArray(array);
        // Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(rotateArrayWithArray(array)).forEach(System.out::println);
    }
}
