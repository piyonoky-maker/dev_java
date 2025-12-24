package ch06;

public class F06 {
    public static void main(String[] args) {
        String str = "자바,오라클,스프링";
        String[] strs = str.split(",");

        for(String s:strs){
            System.out.println(s);
        }
        System.out.println("============================");
        for(int x=0 ;x<strs.length; x++){
            System.out.println(strs[x]);
        }

    }
}
