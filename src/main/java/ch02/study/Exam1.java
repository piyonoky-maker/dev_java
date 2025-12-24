package ch02.study;
/*
JVM이 제공하는 API가 있다.
실행을 위해서는 main메서드 선언하기 - 실행할 수 있다. - 콘솔에 출력해 볼 수 있다.
파일명은 Exam1.java로 만들고 컴파일을 거치면 Exam1.class가 만들어짐.
컴파일이란 고급언어(.java)->저급언어(.class)로 바뀌어준다.
컴파일 과정에서 문법에러가 발견되면 XXX.class파일이 만들어지지 않음.
클래스 선언 후에 좌중괄호와 우중괄호로 스코프를 정해줌.
여러 행을 작성하더라도 항상 main메서드가 제일 먼저 실행됨. - 개발자가 호출하는 메서드가 아님
-> 나중에는 재사용성이나 이식성을 고려할 때 main메서드 코딩하는 양은 줄여나간다.
변수선언하기
타입 변수명 = 값 (기초, 초기화문제는 기초가 아니다)
변수는 위치에 따라 전역변수와 지역변수가 있다.
타입종류 8가지 - int, boolean
원시형 타입(Primative Data Type) - 원시형 타입을 호출하면 값이 출력됨
참조형 타입(Reference Data Type) - 참조형 타입을 호출하면 16진수 주소번지가 출력됨

/**
    JVM이 제공하는 API가 있다
    실행을 위해서는 main메서드 선언하기 - 실행할 수 있다 - 콘솔에 출력해 볼 수 있다
    파일명은 Exam1.java 로 만들고 컴파일을 거치면 Exam1.class 가 만들어짐
    컴파일이란 고급언어(.java) -> 저급언어로 바꿔준다
    컴파일 과정에서 문법에러가 발견되면 xxx.clas 파일이 만들어 지지 않음
    클래서 선언 후에 좌중괄호와 우중괄호로 스코프를 정해좀
    여러행을 작성하더라고 항상 main 메서드가 제일 먼저 실행됨 - 개발자가 호출하는 메서드가 아님
    -> 나중에는 재사용성이나 이식성을 고렬할 때 main메서드 코딩하는 양은 줄여나간다
    변수는 위치에 따라 전역, 지역 변수가 있다

    변수 선언하기
    타입 변수명 = 값
    변수눈 유ㅏ차애 떠러 전역변수와 지역 변수가 있다

    타입의 종휴 8가지 int, boolean
    
    원시형 타입 - (Primative Data Type)원시형 타입을 호출하면 값이 출력됨
    참조형 타입 - (Reference Data Type)참조형 타입을 호출하면 16진수 주쇼번지가 출력됨
 
 * */

public class Exam1 {
    //전역변수 선언하기
    int g = 1;
    static int x = 1;

    void methodA(){
        int i = 0;
        System.out.println(i);
    }

    void methodB(){
        int i = 2;
        //서로 다르므로 값이 유지 되지 않음
        System.out.println(i);      //2 출력 - 이름은 같지만 서로 다른 변수
    }

    public static void main(String[] args) {

    }//end of Main
}//end of Exam
