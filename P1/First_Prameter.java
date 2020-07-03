public class First_Prameter {
    public static void main(String[] args) {

        // 변수란 무엇인가 ? 저장 공간. 특정한 데이터 타입 저장
        // 변수 생성 방법: [데이터 타입] [변수명];
        // 데이터 타입 종류: int(정수, 4byte), float(실수, 4byte), String(문자열)
        int num1;   // 변수 선언
        String str1;
        float fnum1;

        int num2 = 3;   // 값 할당, =는 대입 연산
        // 실수형에는 float, double이 존재, double은 3.3으로 사용 가능, float은 3.3f로 작성해야 함.
        float fnum2 = 3.3f;
        String str2 = "나는 문자열이야";

        System.out.println(num2);
        System.out.println(fnum2);
        System.out.println(str2);




        int num3 = 3, num4 = 7;
        System.out.println("res = " + num3 + num4);     // 숫자를 문자열로 취급하여 단순히 문자열에 붙이게 됌
        System.out.println("res = " + (num3 + num4));   // 연산자 우선순위 활용

    }
}
