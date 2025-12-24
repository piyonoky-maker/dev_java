package ch05.design;
/*
    어떠한 클래스를 상속받지않고 어떤 인터페이스도 implements도 하지 않는다
    override를 해야 한다 - 강제함
    다른것과 섞어쓸 때는 훨씬 유리하다
    재사용성이 높다 -> 결합도는 낮춰야 한다
    상속은 결합도를 높인다
*/

import ch05.aobject.MemberVO;
import ch05.aobject.MemberVO;
public class JFrame01Logic {

    public JFrame01Logic(){
        System.out.println("JFrame01 생성자 호출 성공");
    }

    public Object[] getList(){
        System.out.println("getList 호출");
        return null;
    }

    /*
    public Object getList(){
        System.out.println("오라클 연동하여 목록 가져오기 처리");
        return null;
    }
 */
}
