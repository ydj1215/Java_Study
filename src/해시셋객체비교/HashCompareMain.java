package 해시셋객체비교;

import java.util.Arrays;
import java.util.HashSet;

public class HashCompareMain {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);

        hashSet.add(new Member(1003, "카리나"));
        for (Member e : hashSet) e.showMember();

        // 집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s1.addAll(s2); // 합집합
        s1.retainAll(s2); // 교집합
        s1.retainAll(s2); // 차집합 
        System.out.println(s1);

    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { // 다운캐스팅이 성립됐는지 확인하기 위한 조건
            Member member = (Member) obj;  // 원래 형으로 형 변환
            if (this.id == member.id) return true; // id가 같으면 중복이라고 판별
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}