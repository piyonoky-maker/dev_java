package ch03;

public class Oper041 {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a++);        //2부터
        // 아래 초기화를 주석으로 하면 a = 2, 2 = 4가 출력된다
        // 주석을 풀어주면 a = 2, a =3이 출력됨
        a = 2;
        System.out.println(++a);        //3부터
    }
}
