package 변수와자료형;

// 변수란? 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것

public class DataTypeClass {
    public static void main(String[] args){
        int age; // 정수형 변수, 4바이트(32bit) 공간을 확보, 초기값은 아직 X, 정수값(소수점 이하가 없음)을 저장하는 목적.
        double value; //실수값을 저장하기 위한 변수 선언.

        // int 1st; // 숫자가 앞에 오면 오류 발생.
        int st1 = 7; // 가능.
        // int class; // class는 예약어.
        int a$$$$; //특수 문자는 _, $ (가능).
        int ____1234;
        int $$$$___;

        System.out.println("st1");
        System.out.println(st1);
        System.out.print("st1");
        System.out.print(st1);
        System.out.print("\n");

        char gender = 'M'; // 선언과 동시에 초기화, gender라는 변수에 문자 M을 대입한다는 의미.
        // int와 double 형은 부호(+,-)가 존재하나, char 형은 부호가 존재 X.

        // 논리형 변수 (참과 거짓을 판별하기 위해 사용하는 자료형) 선언.
        boolean isTrue; // 다른 언어와 같이 0을 제외한 모든 값이 참이 아니다. 오직 true, false 두 가지 값만을 가진다.

        // 정수형 변수 선언 : 소수점 이하 X, 양수와 음수 존재.
        byte bNum; // (1byte = 8bit), 가장 작은 자료형 (-128 ~ 127, 0은 양수 취급)
        short sNum; // (2byte = 16bit)
        int iNum; // (4byte = 32bit)
        long lNum; // (8byte = 64bit)

        // 실수형 변수
        float fNum; // 4byte
        double dNum; // 8byte (일반적으로 사용)
        // 실수형은 정확한 값이 나오지 않기에 (0.999...), 즉 근사치 계산을 하기 때문에 되도록이면 회피해야 한다.

        int num1, num2; // 같은 타입의 변수는 동시 선언 가능. (,로 구분)
        double num3, num4 = 10.1; // num3 는 초기화 X.
        double num5 = 11.1, num6 = 12.2; // 가능

        System.out.println(num6);
        
    }

    //사용자 지정 자료형
    class NameCard
    {
        String name;
        String address;
        String eMail;
        String phoneNum;

        int what;
    }
}
