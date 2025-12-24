package ch03;

import javax.swing.*;

public class Oper031 {
    public static void main(String[] args) {

        int first = 0;
        int second = 0;
        String sFirst = null;
        String sSecond = null;

        sFirst = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
        first = Integer.parseInt(sFirst);
        //int와 Integer의 경우 오토박싱의 지원으로 타입을 자동으로 전환해줌
        //원시형타입과 Wrapper 클래스는 별도로 타입을 맞춰 줒지 않아도 자동으로 처리됨

        sSecond = JOptionPane.showInputDialog("두번째 숫자를 입력하세요", 0);
        // new Integer (괄호안에 정수인 경우) 더 이상 권장 하지 않습니다 - Deprecated
        second = Integer.parseInt(sSecond);

        //System.out.println(second);

        System.out.println();
        System.out.println("두 수의 합은 + "+(first+second));
        System.out.println("1"+2);// 3이 출력되지 않고 12가 출력됨
    }
}
