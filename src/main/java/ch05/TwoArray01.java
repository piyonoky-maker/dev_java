package ch05;

public class TwoArray01 {
    public static void main(String[] args) {
        // 0,0, 0,1, 0,2
        // 1,0, 1,1, 1,2
        int is[][] = new int[2][3];
        for(int row=0;row<is.length;row=row+1){
            for(int cols=0;cols<is[row].length;cols=cols+1){
                System.out.println("is["+row+"]["+cols+"]="+is[row][cols]);
            }
        }
    }
}