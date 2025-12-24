package ch05;

public class FirstArray01 {
    public static void main(String[] args) {
        int is[] = new int[3];
        is[0] = 11;
        is[1] = 12;
        is[2] = 13;

        for(int i:is){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int x=0 ; x<is.length; x++){
            System.out.println(is[x]);
        }


/*
        int is1[] = null;
        is1 = new int[5];
        is1[0] = 1;
        is1[0] = 1;
        is1[0] = 1;
        is1[0] = 1;
        is1[0] = 1;

 */
    }
}
