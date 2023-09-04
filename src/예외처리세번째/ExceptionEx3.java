package 예외처리세번째;

// NullPointException (NPE) : Java 에서 발생하는 대표적인 런타임 에러
// 참조하려는 객체가 없는 경우에 발생

public class ExceptionEx3 {
    public static void main(String[] args) {
        //Test test = new Test();
        Test test = null;

        if (test != null) {
            String testStr = test.name; // 없는 객체를 참조 시도
            System.out.println(testStr);
        } else System.out.println("test is null!");
    }
}

class Test {
    String name = "유동재";
}
