package ch02;

public class Variable5 {

    void methodA(int i, int j){
        System.out.println(i+" | "+j);
    }

    void methodB(int i, int j){
        i = 10;
        j = 20;
        System.out.println(i+" | "+j);
    }

    public static void main(String[] args) {
        Variable5 v5 = new Variable5();
        v5.methodA(1, 3);
        v5.methodB(1, 1);
    }
}
