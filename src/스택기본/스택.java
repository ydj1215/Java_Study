package 스택기본;

import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 맨 위의 요소 확인
        System.out.println(stack.pop()); // 데이터 추출 (마지막에 입력된 데이터)
        System.out.println(stack.empty()); // 텅 비어있나?
        System.out.println(stack.size()); // 크기
        System.out.println(stack.contains(1)); // 스택에 데이터가 존재하면 true 반환
    }
}
