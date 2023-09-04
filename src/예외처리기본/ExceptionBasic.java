package 예외처리기본;

public class ExceptionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) { // 오류 발생 코드
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과했습니다! 값을 확인해 주세요!");
        }
        System.out.println("흠흠");
    }
}
