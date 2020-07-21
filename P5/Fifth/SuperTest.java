package Fifth;

class ParentClass {
    int data = 100;

    public void print() {
        System.out.println("SuperClass: print()");
    }
}

public class SuperTest extends ParentClass {
    int data = 200;

    public static void main(String[] args) {
         SuperTest superTest = new SuperTest();
         superTest.print();
    }

    public void print(){
        super.print();
        System.out.println("SubClassL print()");
        System.out.println(data);
        System.out.println(this.data);
        System.out.println(super.data);

    }
}
