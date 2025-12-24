package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectArray03 implements ActionListener {
    public static void main(String[] args) {
        //JFrame의 디폴트 레이아웃은 BorderLayout
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btns[] = new JButton[5];
        String btns_label[] = {"동쪽", "서쪽", "남쪽", "북쪽", "중앙"};
        String loc[] = {"East", "West", "South", "North", "Center"};

        for(int x=0; x<btns.length; x++){
            btns[x] = new JButton(btns_label[x]);
            jf.add(loc[x], btns[x]);
        }

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
