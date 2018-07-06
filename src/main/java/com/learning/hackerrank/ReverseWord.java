package com.learning.hackerrank;

import java.util.Scanner;

/**
 *
 * @author ashif
 */
public class ReverseWord {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        if (str != null && !str.isEmpty()) {

            String words[] = str.split(" ");

            int i = words.length - 1;
            while (i >= 0) {

                System.out.print(words[i--] + " ");
            }
        }
    }
}
