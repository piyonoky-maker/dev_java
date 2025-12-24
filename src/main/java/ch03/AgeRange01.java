package ch03;

import java.util.Scanner;

/**
나의 범위 체크 ( 성인요금,.. )
 * */
public class AgeRange01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n나이 입력: ");
        int age = sc.nextInt();
        //성인기준: 19세 이상이고 65미만

        if(age >= 19 && age < 65){
            System.out.println("성인 요금이 적용됩니다.");
        }else{
            System.out.println("성인 요금 대상이 아닙니다.");
        }
        sc.close();
    }
}
