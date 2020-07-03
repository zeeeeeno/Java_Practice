import java.util.Scanner;

public class First_Problem {
    public static void main(String[] args) {
        // 문제 1. 정수형 변수를 2개 선언하시오.
        int num1, num2;

        // 문제 2. 정수형 변수 1개를 선언하고 값을 입력한다. 그리고 float 변수를 2개 선언하고 값을 입력한다.
        int num3 = 5;
        float fnum1 = 1.1f, fnum2 = 1.2f;

        // 문제 3. 문제 2번의 결과를 출력하시오.
        System.out.println("num3 = "+num3);
        System.out.println("fnum = "+fnum1+", fnum2 = "+fnum2);

        // 문제 4. 키보드 입력을 통해 정수형을 1개 입력 받고 출력해보자
        System.out.print("정수를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();
        System.out.println("입력받은 정수 값: "+scanNum);

        // 문제 5. 키보드 입력을 받아 두 숫자를 더해보자.
        System.out.print("첫 번째 정수를 입력하세요 >> ");
        int scanNum1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요 >> ");
        int scanNum2 = scanner.nextInt();
        int result = scanNum1+scanNum2;
        System.out.println("첫 번째 입력 값: "+scanNum1+"  두 번째 입력 값: "+scanNum2 +"\n입력 받은 두 숫자의 합: "+result);
    }
}
