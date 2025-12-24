package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 배열(Array): 같은 타입의 데이터 여러개를 한번에 저장하기 위한 변수 선언
 이름 하나로 여러개를 관리함 - 이름으로 판단이 안됨
 배열을 사용시 항상 반복문이 같이 사용됨
 한계: 제한된 클기, 끼워 넣기 안됨, 같은 타입만 담음, 인덱스로접근 하므로 변수명이 직관적이지 않음
 */
public class FirstArray04 implements ActionListener {
    public static void main(String[] args) {
        FirstArray04 fa = new FirstArray04();
        // 나는 객체 배열입니다
        //JFrame -> BorderLayout
        JFrame jf =             new JFrame();
        JButton btns[] =        new JButton[6];
        String btns_label[] =   new String[]{"1:1대화명", "대화명변경", "나가기", "글자색변경", "이모티콘", "방만들기"};

        jf.setLayout(new GridLayout(3, 2));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int x=0; x< btns.length; x++){
            btns[x] = new JButton(btns_label[x]);
            jf.add(btns[x]);
            btns[x].addActionListener(fa);
        }//*/

        /*int labelCount = 0;
        for(JButton x:btns){
            x = new JButton(btns_label[labelCount]);
            jf.add(x);
            x.addActionListener(fa);
            labelCount++;
        }//*/

        jf.setSize(600, 700);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 어떤게 눌렸는지에 대한 구분 : if or switch
        Object obj = e.getSource();
        String buttonLabel = e.getActionCommand();

        System.out.println("["+buttonLabel+"] 을 눌렀습니다");
    }
}
