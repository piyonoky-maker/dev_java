package ch04;

public class Switch03 {
    public static void main(String[] args) {
        int x = 11;
        switch(x){
            case 0: ++x;
            case 1: ++x;
            case 2: ++x;
            default: ++x;
        }
        System.out.println("\n여기 "+x);
    }//end of main


}
