package ch06;
/*
substring(int beginIndex);
substring(int beginIndex, int endIndex);
* */
public class P162 {
    public static void main(String[] args) {
        String s = "Oracle Project";
        String result = s.substring(3);
        System.out.println(result);

        System.out.println(result);
        result = s.substring(3, 5);
        System.out.println(result);
        System.out.println(result.length());
    }
}
