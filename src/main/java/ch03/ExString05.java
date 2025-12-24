package ch03;
/**
StringBuilder나 혹은 StringBuffer중 하나를 사용합니다.
 * */
public class ExString05 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("\n"+s1);
        System.out.println(s1+" World !!!");        //Hello World!!!
        System.out.println(s1);     //Hello

        System.out.println();
        String s2 = "jaja";
        System.out.println(s2.replace('j', 'h'));
        System.out.println(s2);
        //System.out.println(System.identityHashCode(s1));

    }
}
