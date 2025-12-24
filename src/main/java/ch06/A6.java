package ch06;
//Object 는 자바가 제공한느 클래스 이고
//A6은 사용자가 정의한 ㅣ클래스 이다
public class A6 extends Object{
    //부모가 정의하고 있ㄴ느 메서드를 재정의 하면 그 이후부터
    //부모의 메서드는 은닉됨

    @Override
    public String toString(){
        return "ch06";
    }

    public static void main(String[] args) {
        A6 a6 = new A6();
        //모든 클래스의 부모 클래스인 Object가 정의하고 있는 메서드
        System.out.println(a6);
        /*
        toString() 메서드는 A6클래스가 구현하는 메서드가 아니라
        부모인 Object가 구현내 놓은 메서드 이다
        부모가 구현(선언) 하고 것들은 자손 크래래스가 사용할 수 있다- 재사용성
        */
        System.out.println(a6.toString());
        //만일 재정의 하려고 하면 할수 있는데 단 원형을 훼손 하면 안됨
        //원향 - 파라미터, 리턴타입
        //재정의 -> 메서드 오버라이딩 -> 부모와 자손관계
    }
}