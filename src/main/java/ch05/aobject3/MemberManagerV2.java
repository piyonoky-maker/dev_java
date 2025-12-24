package ch05.aobject3;

import jdbc.MemberVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberManagerV2 implements ActionListener {
    /** 오라클 서버 연동하기 */
    private final String _DRIVER =      "oracle.jdbc.driver.OracleDriver";
    private final String _URL =         "jdbc:oracle:thin:@localhost:1521:orcl11";
    private final String _USER =        "scott";
    private final String _PW =          "tiger";
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    JFrame jf              = new JFrame();
    //MemberVO[]      mvos            = new MemberVO[3];
    MemberVO[]      mvos            = null;
    JPanel          jp_north        = new JPanel();
    String          cols[]          = {"아이디","이름","나이"};
    String          data[][]        = new String[0][3];
    DefaultTableModel dtm_member    = new DefaultTableModel(data,cols);
    JTable          jtb_member      = new JTable(dtm_member);
    JTableHeader header          = jtb_member.getTableHeader();
    JScrollPane     jsp_member      = new JScrollPane(jtb_member);
    JButton         jbtn_all        = new JButton("조회");

    public MemberManagerV2(){
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

    /********************************************************************
     * 오라클 서버에 접속해서 회원정보 가져오기
     * sql: SELECT mem_id, mem_name, mem_age FROM member;
     * @param null
     * @return MemberVO[]
     */
    public MemberVO[] getMemberList(){
        //MemberVO mvo = new MemberVO();
        try{
            // 오라클 제조사가 제공 하는 드라이버 클래스를 로딩하기
            Class.forName(_DRIVER);
            // 연결객체 생성하기 - 파마미터가 3개 필요함
            con = DriverManager.getConnection(_URL, _USER, _PW);
            // 개발자가 작성한 select문 전달
            StringBuilder sql = new StringBuilder();
            //From앞에 띄어쓰기 하면 SQLException, 끝에 세미콜론 삭제했는지 확인
            sql.append(" SELECT mem_id, mem_name, mem_age ");
            sql.append(" FROM member ");
            // 예외상황이 발생할 수 있을때 try..catch블록을 사용함
            pstmt = con.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();

            //MemberVO[] mvos = null;
            // n개 행으 ㄹ담기 위해서 객체 배열을 선언했음. 그런데 size를 정할 수 없음
            // VO 패턴에는 한 번에 오직 한 행만 담을 수 있다
            // 여러행을 담고 싶다면 객체 배열을 선언함
            
            // 아래 인스턴스화에서 선언만 하고 생성은 반복문에서 해야 함
            MemberVO mvo = null;
            Vector<MemberVO> v = new Vector<>();
            while (rs.next()){
                // 반복문 안에서 왜 객체 생성을 해야 하는 이유( 같은 주소의 같은 값만 들어감 )
                mvo = new MemberVO();
                mvo.setMem_id(rs.getString("mem_id"));
                mvo.setMem_name(rs.getString("mem_name"));
                mvo.setMem_age(rs.getInt("mem_age"));
                // count수를 알수 없으므로 벡터 자료구조에 담기
                // v.size() 메서드를 통해서 count수를 알아 낼수 있다
                v.add(mvo);
            }
            System.out.println(v.size());
            // 반복문에서 add한 숫자만큼 배열의 크기가 됨
            mvos = new MemberVO[v.size()];
            // 위 객체배열은 현재 빈값이라 무언가의 값을 채워야 함
            // 벡터안에 담긴 MemberVO를 MemberVO[] 복사해주는 메서드가
            // Vector.copyInto메서드 이다
            v.copyInto(mvos);
        }catch (Exception e){
            System.out.println("Exception : \t"+e.getMessage());
        }
        return mvos;    //반환되는 mvos
    }

    public static void main(String[] args) {
        MemberManagerV2 mm = new MemberManagerV2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //System.out.println("["+command+"] 버튼이 클릭됩");
        System.out.println("조회버튼을 눌렀을 때만 호출됨 - 개발자가 호출하는게 아님");
        if("조회".equals(command)){
            //System.out.println("before= "+mvos.length+"\t"+mvos[1]);
            //getMemberList(); 가 하는 역할은 MemberVO[]의 의미있는 데이터를 초기화 하는 부분임, NullPointerException

            getMemberList();
            System.out.println("before= "+mvos.length);

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

