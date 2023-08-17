package 시스템입력;

// Scanner 클래스를 사용해서 입력 받음

import java.util.Scanner;

public class SystemInput {
    public static void main (String[] args)
    {
        // sc : Scanner 클래스에 대한 객체 변수
        Scanner sc = new Scanner(System.in);
//        byte a = sc.nextByte(); // byte형 입력을 받아 반환
//        short b = sc.nextShort(); // short 형의 입력을 받아 반환
//        int c = sc.nextInt(); // int 형의 입력을 받아 반환
//        long d = sc.nextLong(); // long 형의 입력을 받아 반환

/*        System.out.println("ch를 입력하세요: ");
        char ch = sc.next().charAt(0); // sc.next() 는 문자열을 입력 받는 메소드이다.
        // .charAt(0) 는 문자 하나 (첫번째 값) 만을 추출하는 메소드이다.
        System.out.println("c : " + ch);*/

/*        float e = sc.nextFloat();
        double f = sc.nextFloat();*/

/*        System.out.println("h를 입력하세요: ");
        String h = sc.next(); // 공백 기준으로 입력을 받는다.
        System.out.println("h : " + h);

        System.out.println("i를 입력하세요: ");
        String i = sc.nextLine(); // 줄바꿈 문자 기준
        System.out.println("i : " + i);*/

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine(); // 버퍼 비우기 (출력해보고 발생 할때만 넣어주면 된다.)
        // 보통 next() 를 사용할 때에 자주 발생
        
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("=====회원 정보 출력=====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }
}
