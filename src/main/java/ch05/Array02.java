package ch05;
/**
sdf
 * */
public class Array02 {
    public static void main(String[] args) {
        int is[] = new int[3];      // 0 0 0
        int js[] = new int[]{1, 2, 3};  // 1 2 3
        int xs[] = {2, 4, 6};          // 2 4 6

        for(int x=0 ; x<is.length; x++){
            System.out.println(is[x]+", "+js[x]+", "+xs[x]);
        }

    }
}
