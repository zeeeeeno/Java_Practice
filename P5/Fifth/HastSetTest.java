package Fifth;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HastSetTest {
    public static void main(String[] args) {
        // 집합 - 원소의 중복을 허용하지 않는다.
        Set<Integer> s = new HashSet<Integer>();
        Random rand = new Random();

        final int RANGE = 51;
        final int MAX = 200;
        final int BIAS = 10;

        int cnt = 0;

        int[] arr = new int[MAX];

        for(int i=0; i<MAX; i++) {
            arr[i] = rand.nextInt(RANGE) + BIAS;
        }

        // 자바의 향상된 foreach 구문
        for(Integer value: arr) {
            cnt++;
            // s는 집합이므로 중복을 허용하지 않으며
            // s.add의 결과는 중복이라면 0을 리턴하고 아니라면 1을 리턴한다.
            // 즉 중복된 녀석이 출력되고 아닐 경우엔 출력되지 않는다.
            if(!s.add(value)) {
                System.out.println(cnt+"중복된 녀석: "+value+" ");
            }
        }
        System.out.println("중복되지 않은 녀석: "+s);
    }
}

/*
1. ArrayList를 가지고 랜덤한 값을 10개 입력받고
    입력받은 값을 랜덤한 조합으로 더해서 합친 결과를 다시 ArrayList에 저장해보자
2. Vector로 ArrayList로 구했던 빈도수 문제를 다시 풀어보자
3. 복습
 */