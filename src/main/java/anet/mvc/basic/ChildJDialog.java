package anet.mvc.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChildJDialog extends JDialog implements ActionListener {
    JPanel jp_south = new JPanel();
    JButton btn_ok = new JButton("확인");
    JButton btn_cancel = new JButton("취소");
    JScrollPane jsp = new JScrollPane();
    ParentJFrame pj = null;

    public ChildJDialog(){}
    public ChildJDialog(JFrame owner) {
        super(owner, "Child JDialog", false);
        pj = (ParentJFrame) owner;
        initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //확인 버튼
        if(source == btn_ok) {
            pj.btn_insert.setText(pj.btn_insert.getText()+" 을 눌렀습니다");
            pj.refresh();
            this.setVisible(false);

            System.out.println("btn_ok");
        }
        else if(source == btn_cancel) {
            //pj.refresh();
            this.setVisible(false);
            System.out.println("btn_cancle");
        }
    }
    public void initDisplay() {
        btn_ok.addActionListener(this);
        btn_cancel.addActionListener(this);
        this.setTitle("입력|수정|상세보기");
        this.setSize(300, 300);
        this.setVisible(false);
        //this.setVisible(true);

        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(btn_ok);
        jp_south.add(btn_cancel);
        this.add("South", jp_south);
        this.add("Center", jsp);
        //this.dispose();

    }
    public static void main(String[] args) {
        //ChildJDialog dialog = new ChildJDialog();
        //dialog.initDisplay();
    }
}