package 객체지향연습문제;

// https://www.acmicpc.net/problem/1076

import java.util.Scanner;

public class ResistEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String num3 = sc.nextLine();
        long first = 0;
        long second = 0;
        long third = 0;

        switch (num1) {
            case "black":
                first = 0;
                break;
            case "brown":
                first = 1;
                break;
            case "red":
                first = 2;
                break;
            case "orange":
                first = 3;
                break;
            case "yellow":
                first = 4;
                break;
            case "green":
                first = 5;
                break;
            case "blue":
                first = 6;
                break;
            case "violet":
                first = 7;
                break;
            case "grey":
                first = 8;
                break;
            case "white":
                first = 9;
                break;
            default:
                break;
        }

        switch (num2) {
            case "black":
                second = 0;
                break;
            case "brown":
                second = 1;
                break;
            case "red":
                second = 2;
                break;
            case "orange":
                second = 3;
                break;
            case "yellow":
                second = 4;
                break;
            case "green":
                second = 5;
                break;
            case "blue":
                second = 6;
                break;
            case "violet":
                second = 7;
                break;
            case "grey":
                second = 8;
                break;
            case "white":
                second = 9;
                break;
            default:
                break;
        }

        switch (num3) {
            case "black":
                third = 1;
                break;
            case "brown":
                third = 10;
                break;
            case "red":
                third = 100;
                break;
            case "orange":
                third = 1000;
                break;
            case "yellow":
                third = 10000;
                break;
            case "green":
                third = 100000;
                break;
            case "blue":
                third = 1000000;
                break;
            case "violet":
                third = 10000000;
                break;
            case "grey":
                third = 100000000;
                break;
            case "white":
                third = 1000000000;
                break;
            default:
                break;
        }

        String stringFirst = first + "";
        String stringSecond = second + "";
        //System.out.println(stringFirst + stringSecond);
        long finalResult01 = Integer.parseInt(stringFirst + stringSecond);
        long finalResult02 = finalResult01 * third;
        System.out.println(finalResult02);
    }
}
