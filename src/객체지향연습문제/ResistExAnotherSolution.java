package 객체지향연습문제;

import java.util.Scanner;

// Math.pow(a,b) = a^b 를 사용

public class ResistExAnotherSolution {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red","orange","yellow", "green", "blue", "violet", "grey", "white"};
        int frt = 0, sec=0, thd=0;

        Scanner sc= new Scanner(System.in);
        String frtColor = sc.nextLine();
        String secColor = sc.nextLine();
        String thdColor = sc.nextLine();

        for(int i = 0; i<color.length; i++){
            if(frtColor.equals(color[i])) frt = i;
            if(secColor.equals(color[i])) sec = i;
            if(thdColor.equals(color[i])) thd = i;
        }
        System.out.println((long)((frt*10) + sec) *(long)(Math.pow(10, thd))); // Math.pow(a,b) = a^b
    }
}
