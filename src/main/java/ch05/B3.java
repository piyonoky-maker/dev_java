package ch05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B3 implements ActionListener {
    // 변수 선언이라함 - 생성 이전 단계
    JFrame jf = null;

    public static void main(String[] args) {
        B3 b3 = new B3();
        // 주소번지 두 번을 접근해야 호출이 가능함 - 간접 참조방빗ㄱ
        // B3클래스와 JFrame클래스는 서로 의존 관계가 있다
        if(b3.jf == null){
            b3.jf = new JFrame();
        }
        b3.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b3.jf.setSize(500, 400);
        b3.jf.setVisible(true);
        // static 영역안에서는 non-static 변수 jf 사용이 불가하다

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
