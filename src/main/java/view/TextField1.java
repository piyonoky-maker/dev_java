package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextField1 implements ActionListener {
    //선언부
    JFrame jf = new JFrame();
    JButton btn_send = new JButton("전송");
    JTextField jtf_msg = new JTextField(20);
    String msg = "";
    // boolean isView2 = false;

    //화면 그리기 메서드 구현
    public void initDisplay(){
        System.out.println("init 메서드 구현");

        //이벤트 소스와 이벤트 처리를 담당하는 객체매핑
        btn_send.addActionListener(this);

        boolean isView = false;
        int width = 500;
        int height = 400;
        isView = true;

        jf.add("North", jtf_msg);
        jf.add("South", btn_send);
        jf.setSize(width, height);

        jf.setVisible(isView);

    }

    public void showing (){
        //this.jf.(tyre);
        //TextField1 tf2 = new TextField1();
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sendLabel = e.getActionCommand();
        System.out.println(sendLabel);

        if("전송".equals(sendLabel)){
            jtf_msg.setText("안녕하세요");
        }
    }
    
    // 메인 메서드 구현
    public static void main(String[] args) {
        TextField1 tf1 = new TextField1();
        tf1.initDisplay();
        // tf1.showing();


    }



}
