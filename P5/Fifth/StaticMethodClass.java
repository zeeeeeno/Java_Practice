package Fifth;

class StaticMethod {
    // static 메서드로 어떤 것들을 만드는게 좋을까?
    // 빈번한 입력에 대해서 static 메서드를 적용해주면 쓸대없이 new를 할 필요가 없어진다.
    public static void test() {
        System.out.println("test");
    }
}

public class StaticMethodClass {
    public static void main(String[] args) {
        // 원래 방식은 아래와 같다.
//        StaticMethod sm = new StaticMethod();
//        sm.test();
        StaticMethod.test();
    }
}
