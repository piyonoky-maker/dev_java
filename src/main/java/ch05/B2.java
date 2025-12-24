package ch05;

public class B2 {
    int i = 1;
    //클래스를 선언만 했음 -> 사용시 NullPointerException이 발생함
    B2 b1 = null;   // 여기 b1변수는 전변이다
    void methodA(){
        if(b1 != null){     // 흐름이 바뀌었다
            System.out.println(b1.i);
        }else{
            System.out.println("여기 NullPointerException로 들어옴");
        }
    }

    public static void main(String[] args) {
        //main메서드는 선언부에 static이 있어서 non-static 타입은
        //호출할 수 없음
        B2 b1 = new B2();   //  여기 b1은 지변이다 - 서로 다르다
        b1.methodA();
    }
}
