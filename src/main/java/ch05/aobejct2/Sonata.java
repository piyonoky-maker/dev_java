package ch05.aobejct2;


/**
 객체와클래스 구별하기
 클래스 선언하기
 접근제한자 class이름
*/
public class Sonata extends Object{
    private int speed;
    private int whellNum;
    private String carColor;
    /**
     파라미터가 없는 생성자를 디폴트 생성자라 함
     디폴트 생성자는 파라미터를 결정할 필요가 없어서 JVM이 제공해줌
     파라미터가 있는 생성자는 JVM이 제공할 수 없다
     생성자가 있어서 전변에 대한 초기화를 생략할 수 있었다
     * */
    public Sonata(){
        System.out.println("소나타 디폴트 생성자 이다");
    }

    public void s(String a){
        System.out.println(1);
    }
    public void s(String a, int b){
        System.out.println(2);
    }

    public static void main(String[] args) {
        Sonata myCar = null;
        myCar = new Sonata();
        myCar.speedUp(6);
        System.out.println(myCar.speed);
        /*myCar.s("1");
        myCar.s("1", 1);*/
    }

    void speedUp(int speed){
        System.out.println("speedUp호출");
        /**
         오직 전변만이 변수이름 앞에 인스턴스 변수나 혹은 this수정자를 쓸 수 있다
         * */
        //this.speed = speed + 1;
        this.speed =+ speed + 1;
        System.out.println(this.speed);
    }
}
