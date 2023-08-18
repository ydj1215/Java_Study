package 회원정보;

public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberinfo = new MemberInfo(); // 객체 생성
        //memberinfo.name = "유동재";

        memberinfo.setName();
        memberinfo.setAge();
        memberinfo.setGender();
        memberinfo.setJob();

        memberinfo.getInfo();
    }
}
