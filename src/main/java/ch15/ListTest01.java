package ch15;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // List인터페이스 이어서 new 다음에 쓸 수 없다
        // 인터페이스는 반드시 구현체 클래스가 있어야 함
        // 왜나면 그래야 인스턴스화가 가능함
        // 인터페이스를 인스터스화 할 때는 new 다음에 구현체 클래스가 옴
        // 선언부 타입과 생성부의 타입이 다를 수 있다.
        List nameList = new ArrayList();
        nameList.add("나신입");
        nameList.add("나초보");
        nameList.add("나일등");

        System.out.println(nameList.size());
        System.out.println(nameList.get(1) instanceof Integer);
        System.out.println(nameList.get(1) instanceof String);

        String name = (String)nameList.get(1);
        System.out.println("\n"+name);   //나보초 출력예정

        List<String> nameList2 = new ArrayList<String>();
        nameList2.add("나신입2");
        nameList2.add("나초보2");
        nameList2.add("나일등2");
        String name2 = nameList2.get(0);
        System.out.println(name2);
    }
}
