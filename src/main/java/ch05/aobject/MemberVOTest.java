package ch05.aobject;

public class MemberVOTest {
    public static void main(String[] args) {
        MemberVO mvo = new MemberVO();

        mvo.setMem_id("kiwi");
        String mem_id = mvo.getMem_id();

        mvo.setMem_pw("123");
        String mem_pw = mvo.getMem_pw();

        mvo.setMem_name("김키위");
        String mem_name = mvo.getMem_name();

        mvo.setMem_nick("키위나무");
        String mem_nick = mvo.getMem_nick();

        System.out.println(mem_id);
        System.out.println(mem_pw);
        System.out.println(mem_name);
        System.out.println(mem_nick);
    }
}
