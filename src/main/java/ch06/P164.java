package ch06;
//문자열 찾기
public class P164 {
    public static void main(String[] args) {
        String title = "Hello Java";
        int index = title.indexOf("Java");
        String result = title.substring(index);

        System.out.println("'"+result+"'");
        System.out.println(result.length());
        
        if(index == -1){
            System.out.println("당신이 찾는 문자열은 존재하지 않습니다");
        }else{
            System.out.println("당신이 찾는 문자열은 존재합니다");
        }
    }
}
