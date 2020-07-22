package Sixth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        String[] samples = {"I", "Say", "You", "Test"};
        // 배열을 리스트로 변경한 것이다.
        List<String> list = Arrays.asList(samples);

        // 자바 자료구조와 collections에 있는 sorting을 활용하여 정렬을 수행한다.
        Collections.sort(list);

        System.out.println(list);
    }
}
