package 텍스트파일읽기;

public class Student implements Comparable<Student>{
    private String name;
    private int total;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); // 이름 순 정렬
        return o.getTotal() - this.getTotal();
    }
}
