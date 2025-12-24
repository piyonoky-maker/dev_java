package ch04;

import java.util.Random;
import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int dap = r.nextInt(10);
        int my = -1;
        int cnt = 1;

        while(true){        // 무한루프 주의
            System.out.println("\n0부터 9 사이의 정수를 입력하시오");
            my = sc.nextInt();
            System.out.println("사용자가 입력한 정수는 "+my+" 입니다");

            if(cnt == 5){
                System.out.println("\n5번의 기회를 모두 사용하였습니다.");
                sc.close();
                System.exit(0);
            }else{
                //System.out.println("비교하고 정답이 아니면 힌트문을 주고 반복");
                if(dap == my){
                    System.out.println("축하합니다 \t 카운트: "+cnt);
                    sc.close();
                    System.exit(0);
                }else if(dap > my){     // 높여라
                    System.out.println("높여라");
                    --cnt;
                    //System.out.println(--cnt);
                }else if(dap < my){     // 낮춰라
                    System.out.println("낮춰라");
                    ++cnt;
                    //System.out.println(--cnt);
                }
                cnt++;
            }
        }
    }
}
