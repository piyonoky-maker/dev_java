package ch05.aobejct2;
class M{}   //private
/**
접근제한자
 public > protected > friendly(아무것도 없을때) > private
 private으로 하면 캡슐화를 실형하는 것이다
 해당 변수의 위변조를 막아야 함
 * */
public class NoticeVO {
    private int n_no = 0;
    private String n_notice  = null;
    private String n_content = null;
    private String n_title = null;

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    /**
     getter메서드 - 리턴타입이있다 - 그러나 파라미터는 없다 - 읽기전용
        전변에 담겨있는 값을 획득해온다

     setter메서드 - 리턴타입이 비어있다 - 돌려받을 수 없는 메서드 이다
        이 메서드 내부애서 사용된 지변의 값을외부에서 사용이 불가능함
        파라미터는 있어야 함 - 파라미터 값이 있어야 하는데 전역변수에 세팅하기 위해서임
     * */
    public int getN_no() {
        return n_no;
    }

    public void setN_no(int n_no) {
        this.n_no = n_no;
    }

    public String getN_notice() {
        return n_notice;
    }

    public void setN_notice(String n_notice) {
        this.n_notice = n_notice;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }


}
