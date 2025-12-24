package ch03;

import javax.swing.*;

public class Oper03 {
    public static void main(String[] args) {
        /**
            첫번째 숫자를 입력 받고 두번째 숫자도 입력 받아
            두 숫자의 합을 구해보자
         */
        /*int r1 = Integer.parseInt(JOptionPane.showInputDialog("숫자1"));
        int r2 = Integer.parseInt(JOptionPane.showInputDialog("숫자2", 0));

        int result = r1 + r2;
        */

        int first = 0;
        int second = 0;

        String sFirst = null;
        sFirst = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
        System.out.println("\nsFirst = "+sFirst);
        /**
            원시형타입은 메서드나 field를 소유할 수 없음
            메서드 선언부에 static이 붙어 있으면 (main) 인스턴스화 없이도 바로 사용이 가능
            static이 붙은 메서드는 복제본을 만들지 않음 - 싱글턴 패턴
         * */
        first = Integer.parseInt(sFirst);
        System.out.println("\n당신이 입력한 숫자는? "+first+" 입니다.");
        //만일 사용자가 숫자가 아닌 다른 문자를 입력을 한다면..
    }
}
