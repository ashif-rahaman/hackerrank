package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashif
 */
public class FailFastFailSafe {

    static List<Object> l = new ArrayList();

    public static void main(String[] args) {

        while (true) {

            l.iterator().next();
        }
    }
}
