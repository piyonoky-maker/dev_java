package ch02;

import java.util.Scanner;

public class Variable8 {
    public static void main(String[] args) {
        String str = "1";
        //Variable8 v8 = new Variable8();
        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 9사이의 숫자를 입력하시오 \n");
        String userInput = sc.nextLine();
        System.out.println("당신이 입력한 숫자는  "+userInput+" 입니다");

        System.out.println(userInput instanceof String);


        //System.out.println(userInput+2);

        System.out.println("parseInt+1숫자2 = \t"+(Integer.parseInt("5")+2));

        int imsi = Integer.parseInt(userInput);
        System.out.println(imsi+2);

        /***
            원시형 타입에는 8가지가 있다
            char, byte, short, int, long, float, double, boolean
            참조영 타입은 초출하면 주소번지가 16진수가 표현된다
         */

    }
}
