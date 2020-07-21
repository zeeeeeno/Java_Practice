package Fifth;

/* 문제 3
1. 10 ~ 60까지의 난수를 200개 생성한다.
2. 생성한 정보들에 대한 빈도수를 판정하라.
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int i=1;
        ArrayList<Integer> randList = new ArrayList<>();
        ArrayList<Integer> freqList = new ArrayList<>();
        Random random = new Random();

        while (i<=200) {
            randList.add(random.nextInt(51)+10);
            i++;
        }

        for(int j = 0; j < 61; j++) {
            freqList.add(j, 0);
        }

        for(int idx=0; idx<200; idx++) {
            int freqIdx = randList.get(idx);
            int cnt = freqList.get(freqIdx);
            freqList.set(freqIdx, ++cnt);
        }

        for(int j = 0; j < 61; j++) {
            System.out.println(j + " = " + freqList.get(j));
        }
    }
}
