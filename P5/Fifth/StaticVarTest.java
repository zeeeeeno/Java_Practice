package Fifth;

// 메모리에 존재하는 섹션: Text, Data, Heap, Stack
class StaticVar {
    // Class는 Static 영역에 생성, Static 키워드를 통해 Static 영역에 할당된 메모리는 모든 객체가 공유
    // static 키워드가 붙으면 데이터로 배치, 전역변수화가 이루어
    static int staticNum = 0;

    public StaticVar() {
        // 현재 접속자수 파악에서 용이
        staticNum++;
        System.out.println("Num: " + staticNum);
    }
}

public class StaticVarTest {
    // 메서드에 static이 붙은 경우는 ?
    // 초기에 JVM이 구동되면서 디폴트로 올려주는 메서드에는 static이 붙어있고 이 녀석들은 new 없이 사용할 수 있음
    public static void main(String[] args) {
        // new 연산을 통해 생성한 객체는 Heap영역(속도 느림)에 생성
        // Heap영역의 메모리는 Garbage Collector를 통해 수시로 관리
        StaticVar sv1 = new StaticVar();
        StaticVar sv2 = new StaticVar();
        StaticVar sv3 = new StaticVar();
    }
}
