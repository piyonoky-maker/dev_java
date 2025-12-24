package ch04;

public class For01 {
    int cnt;
    int account(int start, int end){
        int i = 0;
        for(i = start; i<=end ; i++){
            System.out.println(i);
            if(i%2 == 0){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        For01 f1 = new For01();
        int count = f1.account(1, 3);
        System.out.println("\n결과값"+count);
    }
}
