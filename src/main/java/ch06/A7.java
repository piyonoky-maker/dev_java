package ch06;

/*
    원시형 타입
        byte와 short 는 사용하지 않음. JVM처리시 int로 자동 형 전환됨
        char < short < byte < long < float < double
    참조형 타입 - 호출시 16진수 주소번지 출력됨 - 간접참접방식 - 제네릭
        
    정적변수( static <-> non-static ) 하나를 공유함
    인스턴스화가 필요없슴
    주의: static 영역에서 non-static 타입을 사용 불가함
* */
public class A7 {
    // 전변은 클래스 전역에서 사용할 수 있다
    // 전변은 클ㄹ래스 외브에서 인스턴스화를 ㄹ한다면 사용할 수 있다
    int a = 0;

    public A7(){
        methodA();
    }

    //사용자 정의 메서드
    void methodA(){
        int i = 1;
        System.out.println(this.a);
        //System.out.println(this.i);
    }
    // main메서드
    public static void main(String[] args) {
        A7 a7 = new A7();
        //methodA();
    }
}
