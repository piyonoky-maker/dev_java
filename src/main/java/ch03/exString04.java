package ch03;
/**
 String - 읽기 전용 클래스 이다
 원본이 바뀌지 않음. 불변객체 이다
 * */
public class exString04 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(System.identityHashCode(s1));
        s1 += " World !!!";
        System.out.println(System.identityHashCode(s1));
        s1 = s1 + " JAVA";
        System.out.println(System.identityHashCode(s1));
    }
}
