package 회원정보;

//이름, 나이, 성별, 직업

import java.util.Scanner;

public class MemberInfo {

    String name; //이름
    int age; // 나이 (input: M, F, output : 남성, 여성 / 1~199)
    char gender; //성별
    int job; // 직업 (1. 학생, 2. 회사원, 3. 주부, 4. 무직)

    Scanner sc = new Scanner(System.in);

    // Alt + insert 로 getter, setter 함수 자동 생성 가능
    public void setName() {
        System.out.println("이름을 입력하세요. : ");
        name = sc.nextLine();
    }

    public void setAge() {
        while (true) {
            System.out.println("나이를 입력하세요. : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return;
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }

    public void setGender() {
        while (true) {
            System.out.println("성별을 입력하세요. : ");
            gender = sc.next().charAt(0);
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    break;
                default:
                    System.out.println("성별을 잘못 입력했습니다.");
                    //continue;
            }
            break;
        }
        //수행 해야 할것 (continue 사용이유)

    }

    public void setJob(){
         while(true){
             System.out.println("직업을 입력하세요 (1. 학생, 2. 회사원, 3. 주부, 4. 무직) : ");
             job = sc.nextInt();
             if(job>0 && job<5) break;
             System.out.println("직업을 잘못 입력했습니다.");
         }
    }

    public int getGenderType(){
        if(gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void getInfo(){
        String[] genderStr = {"", "남성", "여성"}; // 1~2번만 받기 위해서 0번을 비워두는 것
        String[] JobStr = {"", "학생", "회사원", "주부", "개백수"};

        System.out.println("=".repeat(5)+" 회원 정보 " + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + JobStr[job]);
    }
}