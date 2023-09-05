package 텍스트파일읽기;

// 다른 풀이, Student.java 클래스 사용

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\텍스트파일읽기\\text.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1])
                            + Integer.parseInt(lineSplit[2])
                            + Integer.parseInt(lineSplit[3])));
        }
        for (Student e : treeSet){
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }

}
