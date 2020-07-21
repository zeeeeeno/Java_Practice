package Fifth;

class Parent {
    int a = 10;

    void b() {
        System.out.println("Parent b()");
    }
}

// 자바에서 상속을 사용할 때는 extends를 붙인다.
// python은 괄호 안에 적는 형식, c++은 ':' 뒤에 적는 형
class Child extends Parent {
    int a = 20;

    void b() {
        System.out.println("Child b()");
    }

    void c() {
        System.out.println("Child c()");
    }
}

public class ExtendsTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.b();
        System.out.println("Parent p:"+p.a);

        Child c = new Child();
        c.b();
        c.c();
        System.out.println("Child c: "+c.a);

        // 데이터 타입은 Parent이고 실제 할당 정보는 Child이기 때문이다.
        // 변수는 Parent관점, 메서드는 Child 관점
        Parent p2 = new Child();
        p2.b();
        System.out.println("Parent p: "+p.a);
    }
}
