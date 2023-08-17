package 형변환;

// 형 변환 : 하나의 데이터 타입을 다른 타입으로 변환하는 것
// 명시적 형 변환 : 개발자가 의도를 가지고 형 변환을 하는 것
// 묵시적 형 변환 : 컴파일러가 자동으로 해주는 것 (유리한 방향으로 변경)
public class TypeCasting
{
    public static void main(String arg[])
    {
        int num_1 = 1, num_2 = 4;
        double result_1 = num_1 / num_2; // 형 변환 X
        double result_2 = (double) num_1 / num_2; // 명시적(num_1), 묵시적(num_2) 형 변환
        System.out.println(result_2);

        String kor = "90";
        int mat = 88;
        int eng = 57;
        int total = Integer.parseInt(kor) + mat + eng; // 총점
        double avg = total / 3; // 평균
        double avg_2 = (double)total / 3; // 평균

        System.out.println(avg);
        System.out.println(avg_2);

//        String string = "90";
//        int intString = Integer.parseInt(string); // 정수로 간주하겠다는 메소드
//        System.out.println(string);
    }
}
