package ch02;


/**
    원본과 복사본
    Inner class
 */

class Param {
    /**
        전역변수 - 외부의 전역 클래스에서도 접근이 가능함
        초기화는 안됨
     */
    int ival;
}

public class Variable9 {
    void effectParam(Param p){
        p = new Param();
        p.ival = 100;
        System.out.println("Sub ival : "+p.ival);
    }

    public static void main(String[] args) {
        Variable9 v9 = new Variable9();
        Param p = new Param();
        p.ival = 500;           // 500 | 500
        v9.effectParam(p);      // 100 | 500?
        System.out.println("Main ival : "+p.ival);  // 100 | 100
    }
}
