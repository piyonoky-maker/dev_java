package ch03;

import javax.swing.*;

// 대화형 프로그래밍 연습해보기
public class Oper02 {
    public static void main(String[] args) {
        //메서드를 호출할 때 마라미터 갯수와 타입을 맞춰야 함
        //같은 이름의 메서드를 허용함
        // 자바에선 같은 이름의 메서드를 중복하여 선언할 수 있다
        // 단 파라미터의 갯수가 다르거나 또는 타입이 다르면 사용이 가능하다
        String r1 = JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하세요");
        String r2 = JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하세요", 0);
/*
        System.out.println("\n값 = "+r1);
        System.out.println("값 = "+r2);
*/
        if(1 <= Integer.parseInt(r1) && Integer.parseInt(r2) <= 9){
//        if(1 >= Integer.parseInt(r1) && Integer.parseInt(r2) <= 9){
            System.out.println("\n입력하신값은 "+r1+" 입니다");
        }else{
            System.out.println("\n1부터 9사이의 숫자만 입력해야 합니다");
            return;
        }
        System.out.println("else인 경우가 여기가 실행기회를 갖지 못함");
        System.out.println(r2);
    }
}
