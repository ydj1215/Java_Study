package 스택괄호예제;

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수식 입력: ");
        String string = sc.next();

        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if(ch==')'){
                if(!st.isEmpty())st.pop();
            }
            else{
                System.out.println("괄호가 일치하지 않습니다.");
            }
        }
        if(st.isEmpty()){
            System.out.println("괄호가 일치합니다.");
        }
        else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
