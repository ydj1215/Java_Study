package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        // si 는 참조 변수이다.
        // s1에는 실제 데이터가 아닌 참조 주소가 저장되기 때문이다.
        // 힙 영역에 Student 클래스의 메모리를 동적 할당 받는다.
        s1.setName("유동재"); // 쓰기
        s1.setAddr("경기도 성남시 분당구");

        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");

        Student s3 = new Student();
        s3.setName("김유나");
        s3.setAddr("수원시 팔달구");
        
        s1.showInfo();
    }
}

//  접근제어자 : default, public, private, protected
