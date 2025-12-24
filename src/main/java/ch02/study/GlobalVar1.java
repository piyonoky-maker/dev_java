package ch02.study;

// 문제: 사원번호를 7566으로 변경하는 코드를 작성해보자
public class GlobalVar1 {
    // 전역변수 설정하는 위치
    //public static final String APP_NAME = "MyApp";


    int empno = 0;

    void methodA(){
        empno = 7499;
    }
    public static void main(String[] args) {
        GlobalVar1 gv1 = new GlobalVar1();
        gv1.empno = 7566;
        System.out.println(gv1.empno);

        //System.out.println(a);
    }
}
