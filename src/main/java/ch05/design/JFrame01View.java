package ch05.design;
/*
    조회버튼에 주소번지를 가짐
* */
import javax.swing.*;

public class JFrame01View {
    JFrame jf = new JFrame();
    JButton btn = new JButton("조회");
    JFrame01Event jevent = new JFrame01Event(this);
    JFrame01Logic jlogic = new JFrame01Logic();


    public JFrame01View(){
        this.initDisplay();
    }
    public void initDisplay() {
        System.out.println("initDisplay 호출");

        btn.addActionListener(jevent);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add("North", btn);
        jf.setSize(500, 400);
        jf.setVisible(true);

    }

    /*
    JFrame jf = new JFrame();
    JButton btn = new JButton("조회");

    public JFrame01View(){
        System.out.println("디폴트 생성자 호출");
        this.initDisplay();
    }

    public void initDisplay(){
        System.out.println("initDisplay 호출");
        //btn.addActionListener(this);

        JFrame01Event jfEvent = new JFrame01Event(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add("North", btn);
        jf.setSize(500, 400);
        jf.setVisible(true);
    }
    */

    public static void main(String[] args) {
        JFrame01View jv = new JFrame01View();
    }
}
