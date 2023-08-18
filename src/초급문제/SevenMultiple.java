package 초급문제;

public class SevenMultiple {
    public static void main(String[] args) {

        int result = 0;
        int count = 0;
        for(int i = 1; i<1000; i++)
        {
            result = 7 * i;
            if(result>1000) break;
            System.out.printf("%-5d ", result);
            count++;
            if(count % 10 == 0) System.out.println();
        }

        // 다른 풀이 방식
//        for(int i = 1; i<= 1000; i++){
//            if(i%7 == 0){
//                System.out.println("%5d", i);
//                if(i%70 == 0) System.out.println("");
//            }
//        }

    }
}
