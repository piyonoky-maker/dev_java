package ch02;

public class Variable3 {
    // 당신의 나이을 담을 수 있ㄴ느 전역변수를 선언하시오

    int age = 0;
    
    //메인메소드를 선언하여 전역변수에 초기화를 30살로 해보 시오

    public static void main(String[] ars){

        Variable3 v3 = new Variable3();

        //전역변수 age는 variable3클ㄹ래스가 모모리에 로딩 될 때 같이 초기화 된다
        //아래 문장을 만나지 전 까지는 이전값을 가지고 있다가 문장을 넘어서면 재정의가 된다
        v3.age = 100;

        System.out.println("\n\n나이 :" + v3.age);
    }
}
