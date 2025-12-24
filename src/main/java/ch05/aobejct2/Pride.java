package ch05.aobejct2;
/**
 클래스는 필드와 메서드(단일책임원칙)로 구성됨
 A is a B의 관계 이면 상속관계 임
 부모가 제공하는 메서드도 내가 사용(호출) 할 수 있다
 자바 API가 제공하는 것들을 활용하여 개발한다
 * */
public class Pride extends Object {
    int speed = 0;

    public Pride(){
        System.out.println("Pride 디폴트 생성자 호출");
        System.out.println(this.speed=12);
    }
    /**
     annotation - 클래스와 동일한 취급 - spring
     자바에서는 같은 이름의 메서드를 인정함
     단 메서드 오버라이딩 또는 메서드 오버로딩 규칙을 준수 해야 함
     선언부(접근제한자, 리턴타입, 파라미터) 는 손대지 않는다
     부모가 가졌던 toString() 메서드가 은닉메서드가 된다
     * */
    @Override
    public String toString(){
        return "나는 프라이드 자동차이고 현재 속도는 "+speed+" 입니다";
    }

    public static void main(String[] args) {
        Pride yourCar = new Pride();
        // main에서는 static 영역이어서 this룰 사용할 수 없다
        // System.out.println(this.speed);
        System.out.println(yourCar.speed);
        System.out.println(yourCar.toString());
        System.out.println(yourCar);
    }
}
