package ch03;
//삼항연산자
// 조건식 ? 값1: 값2
public class Oper05 {
    public static void main(String[] args) {
        int age = 0;
        String result = (age >= 19? "성인": "미성년자");
        System.out.println(result);
    }
}
