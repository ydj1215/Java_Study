package 학생성적정렬;

// 다섯명의 성적을 입력받아서 높은 순으로 정렬
// 만약 성적이 같다면, 이름순 정렬

import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("장원영", 80));
        info.add(new StudentInfo("이서", 60));
        info.add(new StudentInfo("레이", 60));
        info.add(new StudentInfo("가을", 100));

        for(StudentInfo e : info) System.out.print(e.name + " " + e.score + " / ");
    }
}

class StudentInfo implements Comparable<StudentInfo>{
    String name; // 이름
    int score; // 성적

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.score < o.score) return 1; // 뒤의 성적이 큰 경우에 뒤집어라 (내림차순)
        else {
            return this.name.compareTo(o.name); // 사전순 정렬
        }
    }
}
