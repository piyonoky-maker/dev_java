package ch06;
//파라미터에 참조현 타입 넘기기
public class B6 {
    void methodA(int is[]){
        for(int x=0 ;x< is.length; x++){
            System.out.println(is[x]);
        }
    }
    void methodA(int is[][]){
        for(int i=0 ; i< is.length; i++){
            for(int j=0; j<is.length; j++){
                System.out.println(is[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        B6 b6 = new B6();
        int is[] = new int[3];
        int is1[] = {1, 2, 3};                  // 1차배열
        int is2[] = new int []{4, 5, 6};        // 2차배열
        b6.methodA(new int[]{1, 2, 3});
        b6.methodA(is);
        b6.methodA(is1);
        b6.methodA(is2);

        int is3[][] = new int[2][3];
        int is4[][] = {{1, 2, 3}, {4, 5, 6}};
        int is5[][] = new int[][]{{10, 20, 30}, {40, 50, 60}};
        System.out.println("\n");
        b6.methodA(is3);
        System.out.println("==============================================");
        b6.methodA(is4);
        System.out.println("==============================================");
        b6.methodA(is5);
    }
}
