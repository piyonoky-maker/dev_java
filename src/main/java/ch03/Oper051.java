package ch03;

import java.util.Scanner;

public class Oper051 {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 나이를 입력해주세요: ");
        age = sc.nextInt();
        //age = sc.nextLine();
        System.out.println(sc.nextLine());

        String result = (age >= 19? "성인": "미성년자");
        System.out.println(result);

    }
}
