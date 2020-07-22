package Sixth;

public class FinallyTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            arr[11] = 100;

            // 배열의 할당된 크기 이상의 작업을 수행하려고 할 때 발생한다.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위가 벗어났.");
        } finally {
            arr = null;
        }
        System.out.println("나온");
    }
}
