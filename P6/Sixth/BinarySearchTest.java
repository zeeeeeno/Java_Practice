package Sixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i<100; i++) {
            list.add(i);
        }

        int idx = Collections.binarySearch(list, key);
        System.out.println("탐색 값: " + idx);
    }
}
