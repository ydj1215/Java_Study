package 참조타입기초;

// 자바의 데이터 타입은 기본 타입과 참조 타입으로 나누어진다.
// 기본 타입은 정수, 실수, 문자, 논리값 등을 저장하는 타입이다.
// 즉 실제 값이 정수에 저장이 된다.
// 참조 타입은 객체의 주소를 변수에 저장한다.
// 참조 타입에는 배열, 열거형, 인터페이스, 클래스, 문자열이 존재한다.

public class RefType {
    public static void main(String[] args) {
        // 기본 타입
        int age = 25; // int형으로 만들어진 age라는 변수에 실제 값이 저장된다.
        double price = 100.5; // float형을 사용한다면 메모리 절약이 가능
        // 기본 타입의 정수는 실제 값 자체를 스택 영역에 저장한다.

        //참조 타입
        String name = "유동재"; // name에는 실제 값(문자열)이 저장X, 주소가 저장된다.
        // 참조 타입의 변수는 스택 영역에 힙 영역의 주소 값을 가진다.
        /* 스택 영역에는 name이 저장되고,
        name은 힙 영역에 저장되있는 "유동재"의 주소값을 가리킨다.
        "유동재" 라는 문자열 리터럴은 Static(메서드) 영역에 저장된다.
         */

        //int unbox = null; // 기본 형이기 때문에 오류 발생
        try {
            Integer boxedValue = null; // null은 가르키고 있는 대상이 없다는 뜻이다.
            // Integer은 int 형에 대한 참조 타입이기 때문에 null을 넣어도 오류가 뜨지 않는다.
            int intValue = boxedValue;
            System.out.println(intValue);
        }
        catch(NullPointerException e){
            System.out.println("허걱! NullPointerException 오류 발생~!");
        }
        
        String strVal1 = "나희도"; // 리터럴 상수로 고정된다.
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); // heap 영역에 메모리 공간을 확보
        // new는 새로운 메모리 공간을 확보
        
        // 참조 변수에서 ==, != : 주소가 같은지를 묻는다.
        if(strVal1 == strVal3){ // 참조하는 주소가 같은지를 물어본다.
            System.out.println("strVal1과 strVal3이 참조하는 주소가 같다!");
        }
        else System.out.println("strVal1과 strVal3이 참조하는 주소가 다르다!");

        if(strVal1 == strVal2){
            System.out.println("strVal1과 strVal2이 참조하는 주소가 같다!");
        }
        else System.out.println("strVal1과 strVal2이 참조하는 주소가 다르다!");

        if(strVal1.equals(strVal3)) { // 포함된 내용, 즉 문자열이 같은지를 물어본다.
            System.out.println("strVal1과 strVal3의 내용이 같다!");
        }
        else System.out.println("strVal1과 strVal3의 내용이 다르다!");

        if(strVal1.equals(strVal2)) { // 포함된 내용, 즉 문자열이 같은지를 물어본다.
            System.out.println("strVal1과 strVal2의 내용이 같다!");
        }
        else System.out.println("strVal1과 strVal2의 내용이 다르다!");
    }
}
