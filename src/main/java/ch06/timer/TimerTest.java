package ch06.timer;
//테스트용 사용하지 않음
public class TimerTest {
    public static void main(String[] args) {
        TimeServer ts = new TimeServer(null);
        System.out.println(ts.getTime());
    }
}