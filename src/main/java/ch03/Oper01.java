package ch03;

public class Oper01 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int hap = i + j;

/**
    system.print %d %s %f는 Java 언어에서 System.out.printf() 함수를 사용하여
    정수, 문자열, 실수를 순서대로 출력하는 코드입니다.
    %d는 정수, %s는 문자열, %f는 실수를 나타내며,
    각 형식 지정자에 해당하는 값을 쉼표로 구분하여 전달합니다.
 * */


        System.out.println("\n두 수의 합은 = "+hap);
        System.out.printf("두 수의 합은 = %d", hap);
        hap = i - j;
        hap = i * j;
        hap = i / j;
        // 아래코드는 정수형으로 출력됨
        System.out.println(hap);

        // 아래는 실수형으로 출력됨 - 소수 아래자리
        double d = i/(double)j;
        System.out.println(d);
        System.out.println(i == j);//false
    }
}
