package 배열을이용한정렬;

// 일차원 배열을 이용한 기본 정렬
// 사용 예시의 버블(삽입) 정렬은 일반적인 방법과 약간의 차이가 존재
// 기본적인 버블(삽입) 정렬의 시간 복잡도는 O(n^2)

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 3, 4, 7, 6, 2, 8};
        int temp = 0;
        
        // 오름차순
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // 기존 값을 대피시켜 놓았다가 다시 옮기는 방식으로 두 개 요소의 위치를 바꾼다.
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int e : arr) {
            System.out.println(e + " ");
        }

        // 내림차순
        for (int m = 0; m < arr.length; m++) {
            for (int n = m; n < arr.length; n++) {
                if (arr[m] < arr[n]) {
                    // 기존 값을 대피시켜 놓았다가 다시 옮기는 방식으로 두 개 요소의 위치를 바꾼다.
                    temp = arr[n];
                    arr[n] = arr[m];
                    arr[m] = temp;
                }
            }
        }

        for (int e : arr) {
            System.out.println(e + " ");
        }
    }
}