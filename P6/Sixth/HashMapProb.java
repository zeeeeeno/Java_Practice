package Sixth;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapProb {
    public static void main(String[] args) {
        final int START = 0;
        final int MAX = 200;
        final int RANGE = 51;
        final int BIAS = 10;

        Random random = new Random();

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        Integer[] samples = new Integer[MAX];

        for (int i = START; i < MAX; i++) {
            samples[i] = random.nextInt(RANGE)+BIAS;
        }

        for (Integer sam : samples) {
            Integer freq = m.get(sam);
            m.put(sam, (freq == null) ? 1 : freq+1);
        }

        System.out.println(m.size()+"개의 샘플이 있다.");
        System.out.println(m.containsKey(17));
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
