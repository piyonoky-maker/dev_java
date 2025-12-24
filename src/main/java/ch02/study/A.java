package ch02.study;

public class A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());

        a = null; //객체 초기화
        // a = null 로 치환되었다가 다시 새로운 객체를 생성하는 시점
        // GC Candidate상태로 대기 상태 - 메모르 크기로 확인을 해볼 수 있음
        a = new A(); // 여기서 생성된 객체는 이전에 생성된 a와는 전혀 다른 객체
        System.gc(); // 랜덤하게 GC가 실행됨
    }
}
