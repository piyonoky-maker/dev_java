package anet.mvc.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ParentJFrame extends JFrame implements ActionListener {
    ChildJDialog chilDlg = new ChildJDialog(this);

    JPanel jp_north = new JPanel();
    JButton btn_insert = new JButton("입력");
    JButton btn_update = new JButton("수정");
    JButton btn_delete = new JButton("삭제");
    JButton btn_select = new JButton("조회");
    JButton btn_detail = new JButton("상세조회");
    JScrollPane jsp_center = new JScrollPane();
    /*public ParentJFrame(){
        chilDlg.initDisplay();
    }*/

    public void refresh(){
        System.out.println("refresh 호출 완료");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //입력
        if(source == btn_insert){
            System.out.println("입력");
            chilDlg.setTitle("입력");
            //아래 코드를 추가하는 이유는 ChildDislog setVisible 변수값을 변경해야 함
            chilDlg.setVisible(true);
        }
        //수정
        else if(source == btn_update){
            System.out.println("수정");
            chilDlg.setTitle("수정");
        }
        //상세조회
        else if(source == btn_detail){
            System.out.println("상세조회");
            chilDlg.setTitle("상세조회");
            chilDlg.setVisible(true);
        }
        //삭제
        else if(source == btn_delete){
            System.out.println("삭제");
            chilDlg.setTitle("삭제");
            chilDlg.setVisible(true);
        }
        //조회
        else if(source == btn_select){
            System.out.println("조회");
            chilDlg.setTitle("조회");
            chilDlg.setVisible(true);
        }
    }
    public void initDisplay() {
        btn_insert.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_select.addActionListener(this);
        btn_detail.addActionListener(this);
        jp_north.add(btn_insert);
        jp_north.add(btn_update);
        jp_north.add(btn_delete);
        jp_north.add(btn_select);
        jp_north.add(btn_detail);
        jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add("North", jp_north);
        this.add("Center", jsp_center);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);     //화면대기상태
    }//end of initDisplay

    public static void main(String[] args) {
        ParentJFrame frame = new ParentJFrame();
        frame.initDisplay();
    }//end of main
}