package Sixth;

class DBZException extends ArithmeticException {
    public DBZException() {
        super("0으로 나누면 안돼");
    }
}

// 산술 연산에 대한 예외를 처리할 위임 클래스
public class ThrowExceptionTest {
    // 사전에 위임 클래스가 예외를 처리할 것임을 알려줌
    public static double quo(int n, int d) throws DBZException {
        if (d == 0) {
            // throw를 사용하는 것은 예외처리를 수행할 수 있는 Exception 계열들을 배
            throw new DBZException();
        }

        System.out.println("How?");
        return (double) n/d;
    }

    public static void main(String[] args) {
        double result;

        try {
            result = quo(1, 0);
        } catch (DBZException e) {
            System.out.println(e.toString());
        }

        System.out.println("Finish");
    }
}
