package ch05.design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame01Event implements ActionListener {
    JFrame01View jv = null;
    public JFrame01Event(JFrame01View jv){
        System.out.println("JFrame01Event 생성자 호출 성공");
        this.jv = jv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("["+command+"] 버튼이 클릭됩");

        jv.jlogic.getList();

        /*if("조회".equals(command)){
            System.out.println("조회버튼이 클릭");
            //(new JFrame01Logic()).getList();
            jv.jlogic.getList();
        }*/
    }
/*    public JFrame01Event(JFrame01View jv){
        jv.btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame01Logic jfLogic = new JFrame01Logic();


        String command = e.getActionCommand();
        System.out.println("["+command+"] 버튼이 클릭됩");

        if("조회".equals(command)){
            //System.out.println("조회버튼이 클릭");
            //(new JFrame01Logic()).getList();
            jfLogic.getList();
        }
    }
 */
}
