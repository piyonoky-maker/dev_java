package ch02;

public class Variable2 {
    //선언부 - 전역변수 (member variable)
    int empno;
    //사용자 정의 메서드
    
    //main 메서드
    public static void main(String [] asrgs){
        int salary = 1;     //지역변수( local variable, automatic variable )
        System.out.println("지역변수 :" + salary);



        Variable2 v2 = new Variable2();
        
        //System.out.println("전역변수 :" + v2.empno);
        v2.empno = 800;
        System.out.println("전역변수 :" + v2.empno);
    }


}
