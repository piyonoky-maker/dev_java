package ch02;

public class Variable4 {
    //사용자 정의 메서드를 구현 하였다
    // b=1; 재정의에 대한 위치에 따라 결과가 달라질 수 있다는 점 확인한는 코드 추가
    // 변수 a에 b를 대입하기 전에 추가 했을 때와 후에 추가했을 때가 결과에 영향이 (있다| 없다)
    void methodA(){
        int a = 1;
        int b = 2;
        System.out.println("methodA before :" + a+", \t b = "+b);

        b = 1;
        a = b;
        System.out.println("methodA after :" + a+", \t b = "+b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b=  2;

        System.out.println("before :" + a+", \t b = "+b);
        a = b;
        b = 1;
        System.out.println("after :" + a+", \t b = "+b);
        System.out.println("\n=================[[ main ]]======================\n");
        // 내 안에 선언한 메서드 이더라도 main안에서 호출할 땐 이스턴스화 룰 해야 한다

        Variable4 v4 = new Variable4();
        v4.methodA();

        System.out.println("methodA");
    }
}
