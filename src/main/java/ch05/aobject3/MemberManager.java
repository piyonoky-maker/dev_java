package ch05.aobject3;

import jdbc.MemberVO;

// java.lang패키지는 자동으로 임포트 되지만 나머지는 따로 해야 함
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MemberManager implements ActionListener {
    JFrame jf              = new JFrame();
    MemberVO[]      mvos            = new MemberVO[3];
    JPanel          jp_north        = new JPanel();
    String          cols[]          = {"아이디","이름","나이"};
    String          data[][]        = new String[0][3];
    DefaultTableModel dtm_member    = new DefaultTableModel(data,cols);
    JTable          jtb_member      = new JTable(dtm_member);
    JTableHeader header          = jtb_member.getTableHeader();
    JScrollPane     jsp_member      = new JScrollPane(jtb_member);
    JButton         jbtn_all        = new JButton("조회");

    public MemberManager(){
        initDisplay();
    }

    public void initDisplay(){
        jf.add("North",jbtn_all);
        jf.add("Center",jsp_member);
        jf.setSize(500,400);
        jf.setVisible(true);
        jbtn_all.addActionListener(this);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void getMemberList(){
        MemberVO mvo = new MemberVO();
        mvo.setMem_id("apple");
        mvo.setMem_name("사과");
        mvo.setMem_age(20);
        mvos[0] = mvo;
        mvo = new MemberVO();
        mvo.setMem_id("banana");
        mvo.setMem_name("바나나");
        mvo.setMem_age(30);
        mvos[1] = mvo;
        mvo = new MemberVO();
        mvo.setMem_id("cherry");
        mvo.setMem_name("체리");
        mvo.setMem_age(40);
        mvos[2] = mvo;
    }

    public static void main(String[] args) {
        MemberManager mm = new MemberManager();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //System.out.println("["+command+"] 버튼이 클릭됩");
        System.out.println("조회버튼을 눌렀을 때만 호출됨 - 개발자가 호출하는게 아님");
        if("조회".equals(command)){
            System.out.println("before= "+mvos.length+"\t"+mvos[1]);
            //getMemberList(); 가 하는 역할은 MemberVO[]의 의미있는 데이터를 초기화 하는 부분임, NullPointerException
            getMemberList();
            
            //조회버튼을 눌렀을 때 기존에 있는 행은 모두 삭제 하는 코드를 작성해보자
            //행의 수가 0보다 크다면 기존에 조회된 결과가 남아 있음
            while(dtm_member.getRowCount() > 0){
                //defaultTableModel의 행의 문제
                dtm_member.removeRow(0);
            }

            for(int x=0; x<mvos.length; x++){
                MemberVO mvo = mvos[x];
                Vector<Object> v = new Vector<>();
                v.add(mvo.getMem_id());
                v.add(mvo.getMem_name());
                v.add(mvo.getMem_age());
                dtm_member.addRow(v);
            }
            System.out.println("before= "+mvos.length+"\t"+mvos[1]);
        }
    }
}

