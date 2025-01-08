package ArrayAlgorithm;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearch {

    // int is a datatype and Integer is a object
    public static Integer linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;

            }
        }
        // we can return null because we are using Interger return type instead of int
        return null;
    }

    public static OptionalInt linearSerach2(int[] arr, int item) {
        // we use optionalInt to avoid returning null in case the element is not present
        // in array
        return Arrays.stream(arr).filter(x -> x == item).findFirst();

    }

    public static void main(String[] args) {
        int arr[] = { 2, 45, 67, 10, 39 };

        // System.out.println(linearSearch(arr, 2));
        // System.out.println(linearSearch(arr, 3));

        // if item exist we will print it out
        linearSerach2(arr, 2).ifPresent(System.out::println);
        linearSerach2(arr, 8).ifPresent(System.out::println);
    }
}
