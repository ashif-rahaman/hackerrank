package com.learning.hackerrank;

/**
 *
 * @author ashif
 */
public class DuplicateInArray {

    public static void main(String[] args) {

        int arr[] = {-1, 2, 3, -1, 3, 6, 6};
        int arr_size = arr.length;

        for (int i = 0; i < arr_size; i++) {

            if (arr[Math.abs(arr[i])] >= 0) {

                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {

                System.out.print(Math.abs(arr[i]) + " ");
            }
        }
    }
}
