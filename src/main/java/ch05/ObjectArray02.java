package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectArray02 implements ActionListener {
    public static void main(String[] args) {
        //JFrame의 디폴트 레이아웃은 BorderLayout
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        //jf.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btns[] = new JButton[5];
        String btns_label[] = {"동쪽", "서쪽", "남쪽", "북쪽", "중앙"};
        for(int x=0; x<btns.length; x++){
            btns[x] = new JButton(btns_label[x]);
            jf.add(btns[x]);
        }

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
