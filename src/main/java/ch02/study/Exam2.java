package ch02.study;

public class Exam2 {
    public static void main(String[] args) {
        int comm = 0;
        // 지역변수는 외붕[ 다른 클래스에서 사용이 불가함
        // 전역변수는 클래스 전역에서 사용이 가능하고 다른 클래스에서도 사용이 가능함
        int x = 300;

        comm = x;
        System.out.println(comm);
    }
}
