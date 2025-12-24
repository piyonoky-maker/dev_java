package ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
    interface는 추상클래스 ( abstract ) 보다 더 추상적임
    상속 (extends) 은 결합도가 증가되지만 인터페이스( interface )는 결합도를 낮춰준다
* */
public class ListTest02 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        Vector v1 = new Vector();
        List list2 = new ArrayList();
        List list3 = new Vector();

        String[] names = new String[3];
        v1.copyInto(names);
        /*
        부모에 대한 구현체 클래스 ㅓ관계에 있을 때 자손은 부몽,;
        전역변수 나 메서드를 호출 할 수 있다
        그러나 부모는 자손이 정의 하는 변수나 매서드를 사용할 수 없다.

        list3.copyInto(names); 사용이 불가함. List 타입에는 없는 메서드임
        */
    }
}
