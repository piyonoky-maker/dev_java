package ch02;

public class GlobalVariable1 {
    
    int empno =7566;
    
    public static void main(String[] args) {
        //여기에서 사원번호 7566을 출력하려고 해보자
        
        GlobalVariable1 gv = new GlobalVariable1();
        System.out.println("변경 전 사원 번호 : "+gv.empno);
        gv.empno = 7499;

        System.out.println("원본 사원 번호 : "+gv.empno);
        gv = new GlobalVariable1();
        gv.empno = 8000;

        System.out.println("변경 후 사원 번호 : "+gv.empno);
        System.out.println(gv.empno);


        GlobalVariable1 gv2 = new GlobalVariable1();
        System.out.println("원본 사원 번호 : "+gv2.empno);
    }
}
