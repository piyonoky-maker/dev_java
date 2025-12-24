package ch05;

class EmpVO{
    int empno;
    String ename;
    String job;
    /*
    @Override
    public String toString(){
        return "사번은 7566이고 이름은 SCOTT, 그리고 Job은 개발 입니다.";
    }
    */
}

public class EmpMain {
    public static void main(String[] args) {
        //객체 배열이라고 함
        EmpVO evos[] = new EmpVO[3];
        for(int x=0 ; x<evos.length; x++){
            evos[x] = new EmpVO();
            evos[x].empno = 7566;
            evos[x].ename = "SCOTT";
            evos[x].job = "개발";

            System.out.println(evos[x].empno);
        }
    }
}
