package 비트연산자;

// 비트 연산자는 비트 단위의 연산을 수행한다.
// AND : &, 논리곱, 모두 1일때만 1
// OR : |, 논리합, 모두 0 일때만 0
// XOR : ^, 두개의 비트가 같으면 0, 다르면 1
// NOT : ~, 비트 반전
// 왼쪽 쉬프트 : <<, 비트 들을 왼쪽으로 이동, 오른쪽에 0으로 채운다.)
// 오른쪽 쉬프트 : >>, 비트들을 오른쪽으로, 왼쪽에 부호 비트를 채운다.)

public class BitOperate
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 2;
        System.out.println(num1 ^ num2);
        System.out.println(num1 | num2);
        System.out.println(~num1);
        System.out.println(num1<<1); // *2 와 동일
        System.out.println(num1>>1); // /2 와 동일, 속도가 일반적인 나눗셈보다 빠르다. 성능에서 이득.
    }
}
