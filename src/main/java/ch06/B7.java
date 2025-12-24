package ch06;

public class B7 {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(null.toString());
        //아래조건을 만족했을떄만 실행문이 실행됨
        if(s != null){
            //조건에 따라 실행기회를 가지지 못함
            System.out.println(s.toString());
        }

        System.out.println("여기");
    }
}
