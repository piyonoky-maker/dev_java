package ch06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A9 implements ActionListener {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JFrame jf1 = new JFrame("공지사항");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setTitle("[[공지사항]]");
        jf.setSize(300, 300);
        jf.setVisible(true);

        jf1.setSize(300, 300);
        jf1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

