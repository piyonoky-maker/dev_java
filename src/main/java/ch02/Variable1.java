package ch02;
//클래스 선언하기
//클래스 파일에 코딩을 한다. - 코딩을 하는 최소 파일이 클래스
//Variable1.java로 작성됨 - 컴파일 - Variable1.class(이진) - 배포하는 파일
//베포
// * 보안이슈로 패키지가 없는 없는 클래스는 에러임 *
public class Variable1 {
    // 선언부

    // 사용자 정의 메서드

    // 실행파일로 만들기 위해서는 main메서드가 있어야 한다.
    // 로컬에서 실행할 떄 필요한 메서드 이다
    // 가장먼저 실행되는 것이 main 매서드이다 - entry point - main thread
    public static void main(String[] args) {
        System.out.println("main 호출");
        // 변수선언 및 초기화
        // 원시형 타입 선언(8가지 )

        int empno = 7566;
        empno = 7499;
        int deptno; //변수선언
        deptno = 10;    // 변수선언

        System.out.println("사원번호: "+empno+" "+deptno);

    }
}
