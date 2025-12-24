package ch02.study;
// 클래스 구성요소 = 메서드와 필드 ( 변수 )
// VO(Value Object)패턴 또는 DTO(Data transfer Object)패턴
class DeptVO{   // ERP시스템
    int deptno = 0; // 부서번호 담기 - number(2) - int(4byte-32bit) or long(8byte-64bit)
    String dname = null;   // 부서이름 varchar2 -> String
    String loc = ""; // 지역 varchar2 -> String
}

class DeptDTO{

}

public class DeptVOMain {
    public static void main(String[] args) {
        //클래스 선언과 생성하기 이다
        //RAM을 stack 영여과 heap영역으로 나누어 관리함
        //클래스는 heap영역에 로딩
        DeptVO dvo = new DeptVO();  // 인스턴스화
        dvo.deptno = 10;
        //dvo.deptno = "10"; 문법에러 -> cast 오류
        //DeptVOMain클래스에서 DeptVO클랫스에 선언된 deptno변수를 사용할 수 없다
        //naub메서드가 있는 클래스에서 다른 클래스에 선언된 변수를 접근 하려면 인스턴스화 해야함
        dvo.dname = "ACCOUNTING";
        //다른 클래스에 선언된 전변을 접근할 때는 인스턴수변수.전변이름 으로 접근함
        dvo.loc = "NEW YORK";

        System.out.println("\n"+dvo.deptno);
        System.out.println(dvo.dname);
        System.out.println(dvo.loc);


        dvo.deptno = 20;    // 이와 같이 하면 기존의 값은 덮어 쓰기가 됨 - 재정의가 됨
        dvo.dname = "RESEARCH";
        dvo.loc = "DALLAS";

        System.out.println("\n"+dvo.deptno);
        System.out.println(dvo.dname);
        System.out.println(dvo.loc);

        /*dvo.deptno = 30;    // 이와 같이 하면 기존의 값은 덮어 쓰기가 됨 - 재정의가 됨
        dvo.dname = "SALES";
        dvo.loc = "CHICAGO";

        System.out.println("\n"+dvo.deptno);
        System.out.println(dvo.dname);
        System.out.println(dvo.loc);*/

    }
}
