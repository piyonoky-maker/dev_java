package ch03;

/**
    증감연산자 - for문 사용됨, 대입엽산자
    i=i+1; i=i, i=i-1
    전위연산자, 후위연산자
 * */
public class Oper04 {
    public static void main(String[] args) {
        int a = 1;
        //대입연산자, 증가연산자의 우선순위
        int b = ++a;
        System.out.println("a : "+a+", b : "+b);
        System.out.printf("a : %d, b : %db%n", a, b);
    }
}