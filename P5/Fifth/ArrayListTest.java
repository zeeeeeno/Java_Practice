package Fifth;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // String 타입의 리스트 생성
        // 파이썬 list = [ ]
        ArrayList<String> list = new ArrayList<String>();

        // list.add()는 파이썬의 append와 동일
        list.add("Milk");
        list.add("Grpae");
        list.add("Apple");
        // 특정 위치에 삽입, 원래 있던 녀석들은 뒤쪽으로 밀려남
        list.add(1, "Butter");
        list.add(2, "Straqberry");
        // 특정 위치에 있는 요소를 제
        list.remove(3);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

/* 문제 3
1. 100 ~ 6000까지의 난수를 200개 생성한다.
2. 생성한 정보들에 대한 빈도수를 판정하라.
 */
