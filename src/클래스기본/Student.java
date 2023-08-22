package 클래스기본;

public class Student { // 학생에 대한 설계도
    // 필드, 클래스 내부에 선언된 변수, 인스턴스 필드
    private int Id; // 학번
    private String name; // 이름
    private int grade; // 학년
    private String addr; //주소
    // private : 외부에서 해당 필드에 대한 접근을 막는다.

    // 메서드
    // 메서드의 사용 목적 : 코드의 중복 방지, 수정 용이
    // 가급적이면 하나의 메소드가 하나의 기능만을 수행하도록 설계

    // getter : 읽기
    // setter : 쓰기
    public String getName() {
        return name;
    }

    public String setName(String name) { // 매개변수
        this.name = name; // 클래스의 인스턴스 필드
        return "낄낄"; // 반환
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    // 정보 조회
    public void  showInfo(){
        System.out.println(name + ", " + addr);
    }
}
