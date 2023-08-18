package 연습문제;

import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("제목 : ");
        String title = sc.nextLine();

//        System.out.print("년 : ");
//        int year = sc.nextInt();
//
//        System.out.print("월 : ");
//        int season = sc.nextInt();
//
//        System.out.print("일 : ");
//        int day = sc.nextInt();
//
//        System.out.print("시간 : ");
//        int time = sc.nextInt();

        System.out.print("년월일 : ");
        String date = sc.nextLine(); //20230817

        String year = date.substring(0,4); // 0 1 2 3
        String season = date.substring(4,6); // 4 5
        String day = date.substring(6,8); // 6 7

        System.out.print("시간 : ");
        int time = sc.nextInt();

//        System.out.println(year);
//        System.out.println(season);
//        System.out.println(day);

        System.out.println();
        System.out.println(name + "님");

//        switch (season)
//        {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("한파의 연속인 겨울입니다.");
//                break;
//            case 3:
//                System.out.println("봄의 기운이 느껴지는 3월 입니다.");
//                break;
//            case 4:
//                System.out.println("새싹이 피어나는 4월 입니다.");
//                break;
//            case 5:
//                System.out.println("계절의 여왕 5월 입니다.");
//                break;
//            case 6:
//                System.out.println("활동하기 좋은 6월 입니다.");
//                break;
//            case 7:
//                System.out.println("휴가가 기다려지는 7월 입니다.");
//                break;
//            case 8:
//                System.out.println("무더운 8월 입니다.");
//                break;
//            case 9:
//                System.out.println("선선한 9월 입니다.");
//                break;
//            case 10:
//                System.out.println("천고마비의 계절 10월 입니다.");
//                break;
//            case 11:
//                System.out.println("쓸쓸한 늦가을 11월 입니다.");
//                break;
//        }
//

        switch (season)
        {
            case "12":
            case "01":
            case "02":
                System.out.println("한파의 연속인 겨울입니다.");
                break;
            case "03":
                System.out.println("봄의 기운이 느껴지는 3월 입니다.");
                break;
            case "04":
                System.out.println("새싹이 피어나는 4월 입니다.");
                break;
            case "05":
                System.out.println("계절의 여왕 5월 입니다.");
                break;
            case "06":
                System.out.println("활동하기 좋은 6월 입니다.");
                break;
            case "07":
                System.out.println("휴가가 기다려지는 7월 입니다.");
                break;
            case "08":
                System.out.println("무더운 8월 입니다.");
                break;
            case "09":
                System.out.println("선선한 9월 입니다.");
                break;
            case "10":
                System.out.println("천고마비의 계절 10월 입니다.");
                break;
            case "11":
                System.out.println("쓸쓸한 늦가을 11월 입니다.");
                break;
            default:
                System.out.println("알 수 없는 월입니다.");
                // 조건문 위에 (print문을 대체) greating = " " 으로 초기화해서, 쓰레기 값이 들어가는 것을 방지 가능하다.
        }


        System.out.println("아래와 일정으로 " + title + "를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
        System.out.println();
        //System.out.println("===== 행사 안내 =====");
        System.out.println("=".repeat(5) + " 행사 안내 " + "=".repeat(5));
        System.out.println("행사 안내 :" + title);
        System.out.println("일시 : " + year + "년 " + season + "월 " + day + "일");
        System.out.println("시간 : " + time + "시");
        System.out.println("test");
    }
}
