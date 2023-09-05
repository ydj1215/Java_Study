package 스택괄호예제;

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수식 입력: ");
        String n = sc.next();

        for(int i=0; i<n.length(); i++){
            char ch = n.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if(ch==')'){

            }
        }

    }
}
