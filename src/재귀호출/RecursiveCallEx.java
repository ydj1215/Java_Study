package 재귀호출;

// 재귀호출 : 메서드 자신이 자기자신을 호출하는 것

public class RecursiveCallEx {
    public static void main(String[] args) {
        int result = recFunc(5);
        System.out.println(result);
        
    }

    static int recFunc(int n){
        if(n==1) return 1;
        return n + recFunc(n-1);
    }

    static int whileSum(int n){
        int sum = 0;
        while (n>0){
            sum += n;
            n--;
        }
        return sum;
    }
}
