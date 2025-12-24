package ch06;
/*
메서드 오버라이딩: 전제조건이 서로 상속관계에 있거나 구현체 클래스 관계
    선언부를 손댈수없다( 파라미터, 리턴타입 )
멤서드 오버로딩: 무조건 파라미터 갯수가 다르거나 타입이 다르면 사용가능
* */
class C1{
    C1Main cm = null;
    C1(C1Main cm, String a){

    }
    C1(C1Main cm){
        //아래 코드가 NullPointerException발생할 가능성이 있음
        //System.out.println(cm.nickname);
        this.cm = cm;
        System.out.println(this.cm.nickName);
    }
}

public class C1Main {
    String nickName = null;

    public static void main(String[] args) {
        C1Main cm = new C1Main();
        //C1 c1 = new C1(null);
        C1 c1 = new C1(cm);
    }
}
