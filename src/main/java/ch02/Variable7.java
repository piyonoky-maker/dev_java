package ch02;

//메서드 이름 앞에 void 일떄와 리턴타입이 있을 떄
public class Variable7 {

    void methodA(){
        System.out.println("methodA( 호출 )");
    }
    int methodB(){
        System.out.println("methodB( 호출 )");
        return 5;
    }

    // 자바에서는 메서드 리턴이 1개만 할 수 있다
    public static void main(String[] args) {
        int x = 2;
        boolean isFlag = false;

        //pringln() 메서드 호출함
        System.out.println(x);
        System.out.println(isFlag);

        Variable7 v7 = new Variable7();
        //System.out.println(v7.methodA());
        System.out.println(v7);
        //메서드 안에서 계산된결과를 아래와 같이 사용할 수 있다
        System.out.println(v7.methodB());
    }
}
