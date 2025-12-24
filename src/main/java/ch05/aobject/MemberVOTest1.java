package ch05.aobject;

public class MemberVOTest1 {
    public static void main(String[] args) {
        MemberVO[] mvos = new MemberVO[3];
        MemberVO[] mvos1 = new MemberVO[]{null, null, null};

        for(MemberVO mvo:mvos){
            System.out.println(mvo);
        }
        for(MemberVO mvo:mvos1){
            System.out.println(mvo);
        }
        MemberVO mvo = new MemberVO();
        mvo.setMem_id("kiwi");
        mvo.setMem_id("apple");
        mvo.setMem_id("tomato");
        mvos[0] = mvo;

        System.out.println("\n"+mvos[0].getMem_id());


        /*mvo.setMem_id("kiwi");
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
        System.out.println(mem_nick);*/
    }
}
