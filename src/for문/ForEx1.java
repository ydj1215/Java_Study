package for문;

public class ForEx1 {
    public static void main(String[] args) {

        int i = 1;
//        for(;; i++){
//            System.out.printf("%4d", i);
//            if(i%10 == 0) System.out.println();
//            if(i>100) break;
//        }

        while(true){
            System.out.printf("%4d", i);
            if(i%10 == 0) System.out.println();
            i++;;
            if(i>100) break;

        }
    }

}
