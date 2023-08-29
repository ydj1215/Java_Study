package 박싱과언박싱;

// wrapper 클래스

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12; // Auto Boxing, Boxing = 객체 타입에 값을 집어 넣는것
//      Integer num = new Integer(12); // 객체에 생성자를 통해 값을 대입
//      System.out.println(num);

        Character ch = 'x'; // Auto Boxing (참조(Character) 타입의 값을 기본(char) 타입으로)
        char c = ch; // Auto Unboxing

        System.out.println(c);
    }
}
