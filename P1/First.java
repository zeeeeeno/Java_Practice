/*
Day: 2020-06-22
단축키
    라인 옮기기: alt+shift+방향키
    들여쓰기: ctrl+alt+L
    실행: shift+f10
    행 복사: ctrl+d
    행 삭제: ctrl+y
 */

import java.util.Scanner;
import java.math.*;

public class First {
    public static void main(String[] args) {    // 약어: main
        //println() : 자동 줄 바꿈
        System.out.println("First");
        System.out.println("자동완성");     //약자: sout

        // print() : 줄 바꿈 x, 단순 출력
        System.out.print("1" + " ");
        System.out.println("2");

        // printf() : 우리가 원하는 특정 서식(%d)으로 출력 지원
        // %d - decimal(숫자타입)
        System.out.printf("사과가 %d개 있다.", 8);

        // \n: 한칸 내려쓰기
        System.out.printf("\n%d칸 엔터", 1);


    }
}