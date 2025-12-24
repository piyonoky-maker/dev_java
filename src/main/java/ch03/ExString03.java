package ch03;
/**
 identyHashCode() 객체가 실제로 같은 인스턴스 인지 구분하는데 사용하는 값을 반환
 identyHashCode() 의 값은 실제 메모리 주소는 아니다
 하지만 JVM이 객체를 식별 할 때 사용할 수 있는 가상의 식별코드이다
 * */
public class ExString03 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}
