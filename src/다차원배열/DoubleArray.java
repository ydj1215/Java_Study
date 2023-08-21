package 다차원배열;

// 2차원 배열에서 행에 대한 배열의 값은 실제 값이 존재하지 X
// 열에 대한 시작 주소를 갖고 있다.

public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }

        for (int[] ints : arr) { // 2차원 배열의 향상된 for문
            for (int e : ints) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
