import java.util.Scanner;

public class First_Scanner {
    public static void main(String[] args) {

        // 입력을 받을 때, 사용
        Scanner scan = new Scanner(System.in);  // 시스템이 받는 모든 입력(키보드 마우스)을 의미
        System.out.println("통장에 돈 얼마나 있니 ? ");
        int money = scan.nextInt();     // 키보드 입력을 숫자(정수)로 변환해주는 함수
        System.out.printf("XXX님께서 돈을 %d 가지고 있습니다.\n", money);

        System.out.println("이자율 수치 계산");
        float rate = scan.nextFloat(); // 키보드 입력을 실수형으로 변환

        // math.ceil() : 천정함수, 강제올림
        // math.floor() : 바닥 함수, 강제 내림
        // math.round() : 반올림
        // 실제 컴퓨터에서 실수를 표현할 때, 오차가 발생한다.
        System.out.printf("1년후 값을 금액 = %d\n", (int)Math.round(money*(1.0+rate)));

    }
}
