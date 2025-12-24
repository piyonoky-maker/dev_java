package ch02;
// 메서드의 리턴타입 자리에도 정수 타입이 올 수 있다
// 리턴타입으로 반환받은 값을 어ㄸ허게 다른 메서드에서 사용하는가?
public class Variable6 {
    //메서드 선언시에 리턴타입으 줄 수 있다
    //반환앖이 없다면 void 라고 쓰고 반환값이 있을땐 리턴타입에 대해 맞춰서 사용해야 함
    int methodA(){
        int i = 1;
        System.out.println("\nmethodA : "+i);
        i = i + 2;
        return i;
    }// end of method A

    public static void main(String[] args) {
        Variable6 v6 = new Variable6();
        int i = v6.methodA();

        System.out.println("main : "+ i);


    }//end of main
}
