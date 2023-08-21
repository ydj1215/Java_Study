package 배열기본;

// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료구조
// 인덱스를 사용해서 각 요소에 접근이 가능하다. (인덱스 0부터 시작)
// 배열은 크기를 먼저 지정해줘야 한다.
// C언어의 자바와 달리 자바의 배열은 동적 할당을 한다. (int [] 이 가능하다는 뜻)
public class ArrayBasic {
    public static void main(String[] args) {

        // 1. 배열의 크기를 미리 할당하고, 이후에 초기화 하는 방법
        int[] arr = new int[3]; // 힙 역역에서 정수 3개를 저장할 메모리 공간을 확보
        arr[0] = 85;
        arr[1] = 99;
        arr[2] = 77;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // 향상된 for 문 : 주어진 배열 등의 크기를 자동 순회
        for (int j : arr) {
            System.out.println(j + " ");
        }

        // 2. 이미 정해이진 값을 배열에 대입하는 경우는 new를 사용하지 않아도 된다.
        int [] odd = {1,3,5,7,9};
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        char[] weeks = {'월', '화', '수', '목', '금', '토', '일'};
        // String 배열은 c언어의 이중 포인트와 비슷한 개념이고, char 배열은 일중 포인트와 비슷하다.
    /*
        char 배열은 배열의 내용이 힙 영역에 저장되며, 스택 영역에는 배열의 시작 주소가 저장된다.
        string 배열은 String[] arr 라는 배열이 존재할때, arr 변수는 스택 영역에 저장되고,
        해당 변수에는 배열의 시작주소가 저장된다.
        그리고 각 배열 요소는 힙 영역에 있는 실제 문자열 객체의 주소를 또다시 참조한다.
        이 때문에 char 배열은 c언어의 포인터 개념, string 배열은 이중 포인터 개념에 비유가 가능하다.
     */

        int[] arr2 = {88,99,56};
        int[] arr3 = new int[] {99,88,88};
        int[] arr4; // 객체 타입의 참조 변수이기 때문에, 실제 객체의 주소를 받아야 한다.
        arr4 = new int[3]; // 배열은 객체 타입이다.
        arr4[0] = 100;
        arr4[1] = 88;
        arr4[2] = 77;

        int sum = 0;
        for(int e : arr4) sum += e;
        System.out.println("sum = " + sum);
        //System.out.printf("avr = %.2f\n", (double)sum/arr4.length); // 소수점 두자리 까지만 표현
        double avr = (double)sum/3;
        System.out.println(avr);
        // 향상되 for문은 최근 선호되는 문법이며, 값을 읽을 때만 사용된다.
        // 일반적인 for문과는 다르게 값의 수정이 불가하다.
        for(int i = 0; i<arr4.length; i++){ // 일반적인 for은 이와 같이 값의 수정이 가능
            arr4[i] += 10; //.length처럼 ()가 없는 것은 변수나 필드 값을 직접 읽어온 것이다.
            sum += arr[i];
        } // 향상된 for은 이를 방지가 가능하기에 최근 선호된다.
    }
}
