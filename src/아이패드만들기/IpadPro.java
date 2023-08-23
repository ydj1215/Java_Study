package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IpadPro {
    int screen; // 인치
    int color; // 색상
    int memory; // 기가 바이트
    int network; // 와이파이
    String name; // 각인 서비스 이름
    String productDate; // 생산 일자
    String serialNum; // 일련 번호

    static int count = 0; // 몇대가 생성되었는지 확인 가능, 클래스 변수

    // 생성자
    IpadPro(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 생산한 년월일을 가져온다.
        count++;
        productDate += count;
    }

    // 메서드
    // 계속 구매?
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + " iPad Pro 구입하기" + "-".repeat(5));
        System.out.print("구입하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();

        if (isContinue.equalsIgnoreCase("yes")) return true; // 구입 진행
        else return false; // 구입 종료
    }

    // 화면 사이즈 정하기
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while ((true)) {
            System.out.print("디스플레이 선택: [1] 11인치, [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택해주세요!");
        }
    }

    // 색상 지정
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 : [1] 그레이, [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택해주세요.");
        }
    }

    // 메모리 지정
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1] 128Gb, [2] 256Gb, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요!");
        }
    }

    // 네트워크 설정
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 : [1] Wi-Fi, [2] Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }

    // 각인 서비스 설정
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청하시겠습니까 yes / no : ");
        String service = sc.next();
        if (service.equalsIgnoreCase(("yes"))) {
            System.out.print("이름을 입력하세요 : ");
            name = sc.next();
        }
    }

    // 일련번호 설정
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memoryStr[memory] + netStr + productDate;
    }

    // 화면 가시성
    void progressPad() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(50); // 스레드 일시정지
            } catch (InterruptedException e) {
                // InterruptedException 예외 처리
                Thread.currentThread().interrupt(); // 스레드의 인터럽트 상태를 복구
                break; // 루프 종료
            }
            count++;
            System.out.print("<< iPad Pro 제작중 : [" + count + "%] >>");
            System.out.print("\r"); // 커서를 현재 줄의 처음으로 이동
            if (count >= 100) break;
        }
    }


    // 정보 출력
    void prductPad() {
        final String[] screenType = {"", "11인치", "12.9인치"}; // 상수로 간주
        final String[] colorType = {"", "그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB",};
        final String[] netType = {"", "Wi-Fi", "Wi-Fii+CellularF"};
        System.out.println("=".repeat(5) + " iPad Pro 사양 " + "+".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + colorType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("-".repeat(100));
    }
}

