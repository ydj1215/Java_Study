package 파일복사하기;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "D:\\dev\\work_java\\java_k_digital_0814\\src\\파일복사하기\\bear.JPG";
        String targetFileName = "D:\\dev\\work_java\\java_k_digital_0814\\src\\파일복사하기\\bear_copy.JPG";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo = 0;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) { // fis에서 읽어서
            fos.write(readBytes, 0, readByteNo);  // fos에 쓰자
        }

        fos.flush();
        fos.close();
        fis.close();

        // 복사가 완료된 후 파일을 열기
        openFile(targetFileName);
    }

    private static void openFile(String filePath) {
        try {
            File file = new File(filePath);
            if (Desktop.isDesktopSupported() && file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("파일을 열 수 없습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
