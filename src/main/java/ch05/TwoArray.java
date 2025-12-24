package ch05;

public class TwoArray {
    public static void main(String[] args) {
        int is[][] = new int[2][3];

        for(int row=0; row<is.length; row++){
            for(int col=0; col<is[row].length; col++){
                System.out.println("is[row][cols] = is[row][cols]");
            }
        }
    }
}
