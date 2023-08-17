package 변수의스코프;

public class VarScopeClass
{
    public static void main(String[] args)
    {
        /* 20230816
//        int value = 10; // int 형으로 선언된 value 변수에 10을 대입.
//        int sum = value + 20; // int 형으로 선언된 sum에 value의 값 + 20.
//        System.out.println("Sum의 값: " + sum);

        int n = 20;
        
        if(n > 10) 
        { // 블록 스코프
            int m = 3; // m은 이 안에서만 살아있다.
            m = 10 - n;
            System.out.println("m 의 값은? " + m);
        }

        //int k = n + m; // m은 조건문 안에서만 살아있기 때문에 오류 발생
        int m = 5;
        int k = n + m; // 정상 작동

        // 기본형(int, double 등...)을 제외한 나머지 형(type)은 모두 참조형이다.
        // String형의 String이 대문자로 시작하는 이유는 참조형이기 때문이다.
        // 변수가 참조형이라면, 변수의 값은 해당 데이터의 메모리 주소를 나타낸다.
        // 데이터가 저장된 메모리 주소를 통해 실제 데이터에 접근이 가능하다.

        // 기본형(Primitive Type)은 참조형(Reference Type)과는 다르게 직접 값을 저장하며 주소를 참조하지 않는다.
        // 기본형 변수는 해당 값을 직접 가지고 있는다.
        // 기본형은 자바의 데이터 타입 중에서 기본적인 데이터 단위를 나타내며, 메모리 상에 고정된 크기로 저장된다.

        // C와 C++는 주소를 직접적으로 알 수 있으며 다룰수 있으나 (포인터 개념), 자바는 이를 알 수 없다.
        // 이 특성 때문에, 자바는 성능이 떨어지나 안정적이다.

        byte num1 = 127;
        num1 ++;
        System.out.println(num1); // 오버플로우, 즉 값의 범위 (-128~127)을 벗어나, 새로운 순환이 발생
        //양수와 음수는 최상위 비트로 판단한다. (0이면 양수, 1이면 음수)
         */

        // 20230816
        // 문자 자료형 : 자바에서는 유니코드를 사용 (2byte로 전세계의 모든 문자를 표현
        // 앞의 1byte는 ASCII 와 동일하다.

        char ch = 'A'; // 자바에서 문자는 작은 따음표를 사용, '문자', "문자열"
        // 작은 따음표는 실제 저장은 정수값(유니코드, A = 65)으로 된다.
        //char ch = "A"; // 혼용시 오류 발생
        String st =  "A";

        System.out.println(ch);
        System.out.println((int)ch); // 명시적으로 형을 정수로 변경.
        System.out.println(st);

        char ch_2 = 66; // char 형에는 음수가 올 수 없다. 유니코드 값에 음수가 존재하지 않기 때문이다.
        System.out.println(ch_2);
        System.out.println((int)ch_2);

        // 실수 자료형 : float(4Byte = 32bit), double(8Byte) 들은 근사치 계산법을 사용한다.
        float height = 175.5f;
        //float height = 175.5; // 오류 발생
        double pi = 3.14;
        double num_1 = 0.1;
        for(int i = 0; i<1000; i++)
        {
            num_1 += 0.1;
        }
        System.out.println(num_1); // 정밀도가 떨어지는 결과값

    }
}
