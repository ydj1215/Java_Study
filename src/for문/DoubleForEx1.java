package for문;

// 이중 for문

public class DoubleForEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%d| ", i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for(int i = 2; i <10; i++)
        {
            for(int j = 1; j<10; j++){
                System.out.printf("%d * %d = %d, ", i,j,i*j);
            }
            System.out.println();
        }
    }
}

// ㅈㅇ
