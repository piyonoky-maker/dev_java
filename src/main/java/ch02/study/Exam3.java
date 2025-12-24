package ch02.study;

class Other{
    int ival;
    void methodA(){
        int y = 0;
    }
}


public class Exam3 {
    public static void main(String[] args) {
        // Other 클래스를 메모리에 로딩하기
        // 클래스는 heap 메모리 영역에 살고
        // 지역변수는 stack 메모리 영역에 있음
        Other other = new Other();
        System.out.println(other.ival);
    }
}
