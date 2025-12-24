package ch06;

public class B8 {

    public static void main(String[] args) {
        int[] is = null;
        try {
            System.out.println(is.length);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("is가 생성되지 않아서 에러가 발생함");
            System.out.println(e.getMessage());
        }
        System.out.println("try 문을 지나쳐 감");

    }
}
