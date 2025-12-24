package ch05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectArray01 implements ActionListener {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        {
            String str = "asdf";
            System.out.println(str);
        }

        JButton btns[] = new JButton[5];
        String btns_label[] = {"동쪽", "서쪽", "남쪽", "북쪽", "중앙"};
        for(int x=0; x<btns.length; x++){
            btns[x] = new JButton(btns_label[x]);
        }
        jf.add("East", btns[0]);
        jf.add("West", btns[1]);
        jf.add("South", btns[2]);
        jf.add("North", btns[3]);
        jf.add("Center", btns[4]);

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
