package 성능향상보조스트림;

// 프로그램과 입출력 장치 사이에는 엄청난 속도 차이가 존재한다.
// 이로 인해서 병목 현상이 발생한다. (입출력 장치가 엄청나게 느리다.)
// 이를 해결하기 위해서 사용하는 것이 성능 향상 보조 스트림이다.

import java.io.*;
import java.nio.file.Path;

public class BufferStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; // 성능 향상 보조 스트림
        BufferedOutputStream bos = null;
        int data = -1; // 파일의 끝을 확인하기 위한 변수
        long start = 0; // 시작 시간
        long end = 0; // 종료 시간

//        fis = new FileInputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\성능향상보조스트림\\picture.PNG");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\성능향상보조스트림\\picture_another.JPG");
//
//        start = System.currentTimeMillis();
//        while ((data = bis.read()) != -1){
//            fos.write(data);
//        }
//        fos.flush();
//        end = System.currentTimeMillis();
//        fos.close(); bis.close(); fis.close();
//        System.out.println("성능 향상 보조 스트림을 사용하지 않는 경우 : " + (end-start) + "ms");

        fis = new FileInputStream("D:/dev/work_java/java_k_digital_0814/src/성능향상보조스트림/picture.PNG");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("D:/dev/work_java/java_k_digital_0814/src/성능향상보조스트림/picture_another.PNG");
        bos = new BufferedOutputStream(fos);

        start = System.currentTimeMillis();
        while((data = bis.read())!=-1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close(); bis.close(); fis.close();
        System.out.println("성능 향상 보조 스트림을 사용하는 경우 : " + (end-start) + "ms"); // 사용하지 않는 경우에 비해 훨씬 빠르다.

    }
}
