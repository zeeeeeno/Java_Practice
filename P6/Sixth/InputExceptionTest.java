package Sixth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        System.out.print("나이를 입력하세요: ");
        try {
            i = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요!");
        }
        System.out.println("왓 더");

        scanner.close();
    }
}

