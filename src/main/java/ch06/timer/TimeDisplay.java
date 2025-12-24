package ch06.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TimeClient가 TimeServer에 접속하여 1초에 한 번씩 현재 시간을
//듣는다.
//TimeClient가 청취한 현재 시간을 굳이 TimeDisplay클래스의
//JLabel 화면 중앙에 배치하고 큰 글씨로 출력하기
public class TimeDisplay extends JFrame  implements ActionListener {
    JFrame jf_time = new JFrame();
    JLabel jlb_time = new JLabel("15:35:17",JLabel.CENTER);
    Font font = new Font("굴림체",Font.BOLD,48);

    public TimeDisplay() {
        //생성자 안에서 화면그리기 메서드 호출
        initDisplay();
    }

    public void initDisplay(){
        TimeClient timeClient = new TimeClient(jlb_time);
        timeClient.start();
        jlb_time.setFont(font);
        jf_time.add("Center",jlb_time);
        jf_time.setSize(400,200);
        jf_time.setVisible(true);
    }

    public static void main(String[] args) {
        //오늘부턴 main 메소드에 코드를 가능한 적게 쓰기
        TimeDisplay td = new TimeDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jf_time.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String command = e.getActionCommand();
        System.out.println(command);
    }


}
