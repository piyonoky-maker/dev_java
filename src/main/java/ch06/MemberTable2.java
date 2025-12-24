package ch06;

import ch06.timer.TimeClient2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberTable2 implements ActionListener {

    JFrame jf = new JFrame();       // 디플트 레이아웃이 BorderLayout - 동서,남북 중앙
    JPanel jp = new JPanel();       // FlowLayout
    JTable jt = new JTable();
    String[][] data = new String[0][3];
    String[] cols = new String[]{"아이디", "이름", "나이"};

    DefaultTableModel model = new DefaultTableModel(data, cols);
    JScrollPane jsp = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    JButton btn_select = new JButton("조회");
    JButton btn_insert = new JButton("입력");
    JButton btn_update = new JButton("수정");
    JButton btn_delete = new JButton("삭제");
    JLabel jlb_time = new JLabel("여기",JLabel.CENTER);

    // 선언부
    MemberTable2(){
        initDisplay();
    }
    // 생성자

    // 화면 처리부
    public void initDisplay(){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.setBackground(Color.orange);
        jp.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp.add(btn_select);
        jp.add(btn_insert);
        jp.add(btn_update);
        jp.add(btn_delete);
        TimeClient2 tc2 = new TimeClient2(jlb_time, jf);
        tc2.start();
        jf.add("North", jp);
        jf.add("Center", jsp);
        jf.add("South", jlb_time);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        MemberTable2 mt2 = new MemberTable2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
