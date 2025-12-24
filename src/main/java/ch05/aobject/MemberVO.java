package ch05.aobject;
/**
 getter와 setter
 Spring Boot수업에선 Lombok사용추천
 하나의 클래스에 여러가지 종류의 변수 선언이 가능함
 * */
public class MemberVO {
    // 접근제한자 private은 클래스 내부에서만 접근이 가능함
    // private 으로 변경하면 외부 클래스에서 직접 변조가 불가능
    // 변수는 읽기와 쓰기가 가능해야 함
    private String mem_id = null;
    private String mem_pw = null;
    private String mem_name = null;
    private String mem_nick = null;

    // getter메서드 - 읽기
    // getter는 리턴타입이 있어야 함, 파라미터는 필요 없슴
    public String getMem_id() {
        return mem_id;
    }
    // setter메서드 - 쓰기, 저장
    // 리턴타입은 필요없음, 있어도 상관은 없슴
    // 파라미터는 어떤값을 저장힐지에 따라 값이 필요함
    // 전역변수의 위변조를 막기 위해서 캡슐화 하였다 -> getter. setter가 추가됨
    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_pw() {
        return mem_pw;
    }

    public void setMem_pw(String mem_pw) {
        this.mem_pw = mem_pw;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public String getMem_nick() {
        return mem_nick;
    }

    public void setMem_nick(String mem_nick) {
        this.mem_nick = mem_nick;
    }

    public void setMem_age(int memAge) {

    }
}
