//package 텍스트파일읽기;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class TextReadMain {
//    public static void main(String[] args) {
//        FileInputStream inputStream = null;
//
//        try {
//            inputStream = new FileInputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\자바파이널실습문제\\text.txt");
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("읽을 파일을 찾지 못했습니다!");
//        }
//
//        String[] arr = new String[10];
//        String[][] result = new String[10][4]; // 열 크기를 4로 변경
//        int i = 0;
//
//        Scanner sc = new Scanner(inputStream);
//        while (sc.hasNext()) {
//            String line = sc.nextLine();
//            arr[i] = line;
//            i++;
//        }
//
//        for (i = 0; i < 10; i++) {
//            result[i] = arr[i].split(" ");
//            // 해당 학생의 이름, 성적1, 성적2 값을 더한 값을 3번째 열에 대입
//            result[i][3] = Integer.toString(Integer.parseInt(result[i][1]) + Integer.parseInt(result[i][2]) + Integer.parseInt(result[i][3]));
//        }
//
//        // 정렬
//        Arrays.sort(result, (a, b) -> Integer.compare(Integer.parseInt(b[3]), Integer.parseInt(a[3])));
//        //Arrays.sort(result, (a, b) -> Integer.compare(Integer.parseInt(a[3]), Integer.parseInt(b[3]))); // 내림차순
//
//        System.out.println("성적 내림차순 정렬:");
//        for (String[] student : result) {
//            System.out.println("학생이름 : " + student[0] + "/ 성적 총점: " + student[3]);
//        }
//
//    }
//}
