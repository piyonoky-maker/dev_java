package ch05.aobject3;

import ch05.aobject.MemberVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class JTableDemo {
    JFrame          jf              = new JFrame();
    MemberVO[]      mvos            = new MemberVO[3];
    JPanel          jp_north        = new JPanel();
    String          cols[]          = {"아이디","이름","나이"};
    String          data[][]        = new String[0][3];
    DefaultTableModel dtm_member    = new DefaultTableModel(data,cols);
    JTable          jtb_member      = new JTable(dtm_member);
    JTableHeader    header          = jtb_member.getTableHeader();
    JScrollPane     jsp_member      = new JScrollPane(jtb_member);
    JButton         jbtn_all        = new JButton("전체조회");
    public JTableDemo(){
        /*
        생성자 안에서 내 안이 선언된 메서드선언 할 땐 인스턴수 변수가 필요없슴
        * */
        initDisplay();
    }
    //화면 그리기 구현
    public void initDisplay(){
        jf.add("North",jbtn_all);
        jf.add("Center",jsp_member);
        jf.setSize(500,400);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        JTableDemo jtd = new JTableDemo();
    }
}