package ch03;

import java.util.Scanner;

/**
    점수가 60점 이상이면 합격을 출력하고
    그렇지 않으면 불합격을 출력하는 문정을 완성하시오
    - 필요한 변수는 몇개일까?
    - 필요한 변수의 타입은 몇개일까?

 * */
public class Oper07 {
    public static void main(String[] args) {
        int score = 0;
        //사용자로 부터 점수를 입력받는 코드는?
        int limit = 0;
        System.out.println("당신의 점수를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();//*/


        /*String result = (sc.nextInt()>60? "합격": "불합격");
        System.out.println(result);//*/

        if(score >= 60){
            System.out.println("합격");
        }else{  // 위 조건을 제외한 나머지 모든것
            System.out.println("불합격");
        }//*/
    }
}
