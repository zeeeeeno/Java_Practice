package Sixth;

public class DBZExceptionTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        try {
            // 오류가 발생하는 원인은 아래 코드 때문인다.
            // try를 사용하는 녀석들은 잠재적 오류를 내포한 녀석들
            // 이 녀석이 유류를 유발할 수도 있겠는데? 하는 경우엔 try에 넣으면 된다.
            int result = x / y;

        // 실제로 divide by zero 오류는 cpu에서 감지하는 HW 오류이다.
        // 운영체제의 동작 메커니즘상, 이것은 원래 kernel이라는 os가 처리한다.
        // 하지만 catch구문을 사용해서 내가 대신 처리할게 라고 os에게 요청을 하여
        // 실질적으로 해당 오류가 발생하면 운영체제가 처리 작업을 catch쪽으로 위임한다.
        } catch (ArithmeticException e){
            System.out.println("0으로 나누지 마세요");
        }

        System.out.println("왓 더");
    }
}

