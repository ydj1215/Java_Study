package 바이트스트림;

import java.io.*;

// OutputStream : 바이트 기반 출력 스트림의 추상 클래스
// 바이트 스트림은 사람이 바로 읽기는 불가능하다.

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
        // 쓰기
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);

//        OutputStream os = new FileOutputStream("test2.bin");
//        byte[] array = {10, 20, 30};
//        os.write(array);


//        OutputStream os = new FileOutputStream("test3.bin");
//        byte[] array = {10, 20, 30, 40, 50};
//        os.write(array,1,3);

//        os.flush(); // 버퍼 비우기
//        os.close(); // 자원 반납 후 스트림 닫기
        
        
        // 읽기
        InputStream is = new FileInputStream("test2.bin");
        // 읽는 방법 [1]
//        while(true){
//            int data = is.read(); // 1byte 씩 읽기
//            if(data == -1) break; // 더 이상 읽을게 없으면 -1이 반환된다.
//            System.out.println(data);
//        }
        
        // 읽는 방법 [2]
        byte[] buffer = new byte[100];
        while(true){
            int readNum = is.read(buffer); // 배열의 길이 만큼을 읽기
            if(readNum == -1) break;
            for(int i=0; i<readNum; i++){ // 340 -> 100 100 100 40
                System.out.println(buffer[i]);
            }
        }
        is.close(); // 읽을 때는 버퍼 지우기가 필요하지 않다.
    }
}
