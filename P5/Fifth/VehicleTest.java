package Fifth;

// 문제 1. Vehicle 클래스를 만든다.
//      그리고 Airplane과 Car클래스를 만든다
//      이때 Airplane과 Car는 Vehicle을 상속받는다.
//      내부 변수들을 출력할 수 있게 만들도록 한다.

class CarProblem extends Vehicle {

    public CarProblem(int speed, String color) {
        super(speed, color);
    }

    public void print() {
        System.out.println("CarProblem: print()");
    }
}

class Airplane extends Vehicle{

    public Airplane(int speed, String color) {
        super(speed, color);
    }

    public void print() {
        System.out.println("Airplane: print()");
    }
}

class Vehicle {
    private int speed;
    private String color;

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void print() {
        System.out.println("Vehicle 클래스: print()");
    }

    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(80, "Yellow");
        Vehicle vehicle2 = new CarProblem(100, "Blue");
        Vehicle vehicle3 = new Airplane(100, "Blue");


        vehicle1.print();
        vehicle2.print();
        vehicle3.print();
    }
}
