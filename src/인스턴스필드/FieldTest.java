package 인스턴스필드;

public class FieldTest {
    static int classVal = 10; // 클래스 변수 선언, 정적
    // 단 한번만 할당 가능
    // 메서드 영역에 저장

    int instanceVal = 20; // 인스턴스 변수, 동적
    // 객체 생성때마다 할당 가능
    // 힙 영역에 저장

    // classVal = 20; // 이미 할당되었기 때문에 오류 발생
}
