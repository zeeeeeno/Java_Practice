package Fifth.Task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/*
1. ArrayList를 가지고 랜덤한 값을 10개 입력받고
   입력받은 값을 랜덤한 조합으로 더해서 합친 결과를 다시 ArrayList에 저장해보자
   Vector로 ArrayList로 구했던 빈도수 문제를 다시 풀어보자
 */
public class VectotProblem {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> randSumList = new ArrayList<Integer>();

        Random random = new Random();

        for(int i=0; i<10; i++) {
            arrayList.add(i, random.nextInt(101));
        }

        for(int j = 0; j < 101; j++) {
            randSumList.add(j, 0);
        }

        for(int i=0; i<10; i++) {
            int randSumListIdx = arrayList.get(i);
            int randSumListData = randSumList.get(randSumListIdx);
            randSumList.set(randSumListIdx, ++randSumListData);
        }

        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> w = new Vector<Integer>();

        for(int i=0; i<10; i++) {
            v.addElement(new Integer(random.nextInt(10)));
        }
        System.out.println("size of the vector : "+v.size());

        for(int i=0; i<11; i++) {
            w.add(i, 0);
        }

        for(int i=0; i<v.size(); i++) {
            int tmp = v.elementAt(i);
            int wData = w.elementAt(tmp)+1;
            w.setElementAt(wData, tmp);
        }

        for(int i=0; i<w.size(); i++) {
            System.out.println(i+" 출현 횟수: "+w.elementAt(i));
        }

    }
}
