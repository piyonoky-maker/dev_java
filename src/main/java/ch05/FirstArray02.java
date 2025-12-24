package ch05;

public class FirstArray02 {
    public static void main(String[] args) {
        String is[] = new String[]{"국어", "영어", "수학"};

        for(int x=0; x< is.length; x++){
            System.out.println(is[x]);
        }
        System.out.println("\n");
        for(String i:is){
            System.out.println(i);
        }
    }
}
