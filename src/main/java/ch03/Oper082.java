package ch03;

class Y{
    int ival;
}

public class Oper082 {
    public static void main(String[] args) {
        Y y1 = new Y();
        Y y2 = new Y();

        y2.ival = 100;
        System.out.println(y1 == y2);       // true
        System.out.println(y1.ival+"\t, "+y2.ival); //100, 100
    }
}
