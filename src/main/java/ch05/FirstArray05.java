package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
    내 안에 actionPerformed메서드가 들어왔다
    FirstArray 가 ActionLister인터페이스에 구현체 클래스가 되었다
    인터페이스 안에 있는 메서드는 추상 메서드 이다 - 기능에 대해 결정할 수 가 없다
    이것을 메서드 오버라이딩 이라고 함
    원형은 훼손하지 않고서 기능만 구현해야 함
 */
public class FirstArray05 implements ActionListener {
    public static void main(String[] args) {
        FirstArray05 fa = new FirstArray05();
        // 나는 객체 배열입니다
        JFrame jf =             new JFrame();
        JButton btns[] =        new JButton[6];
        String btns_label[] =   new String[]{"1:1대화명", "대화명변경", "나가기", "글자색변경", "이모티콘", "방만들기"};

        jf.setLayout(new GridLayout(3, 2));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        for(int x=0; x< btns.length; x++){
            btns[x] = new JButton(btns_label[x]);
            jf.add(btns[x]);
            btns[x].addActionListener(fa);
        }


        /*for(JButton x:btns){
            System.out.println(btns);
        }*/

        jf.setSize(600, 700);
        jf.setVisible(true);
    }

    /**
     * 부모가 가진 메서드의 원형을 재정의 함 - 메서드 오버라이드
     * 아래 메섣는 개발자가 직접 호출할 수 없다 - 콜백 메서드 이다
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        // 어떤게 눌렸는지에 대한 구분 : if or switch
        Object obj = e.getSource();
        String buttonLabel = e.getActionCommand();
        //System.out.println(buttonLabel+"\t"+obj);
        /*if("글자색변경".equals(buttonLabel)){
            System.out.println("["+buttonLabel+"] 을 눌렀습니다");
        }*/

        System.out.println("["+buttonLabel+"] 을 눌렀습니다");
    }
}
