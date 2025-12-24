package ch03;
/**
    만약( 조건식 ) 참이면 이코드를 실행하고, 아니면 다른 코드를 실행하시오
    이런 문장을 코드로 표현한 것이 조건문 이다
*/
public class Oper06 {
    public static void main(String[] args) {
        int age = 0;
        // if문 괄호 안에 조건식이 온다
        // 조건문은 항상 boolean( true / false ) 결롸를 기준으로 동작
        if( age <= 19 ){
            //코드 작성
            System.out.println("미성년자");
        }else if(age > 19) {
            //코드 작성
            System.out.println("성인임");
        }
    }
}
