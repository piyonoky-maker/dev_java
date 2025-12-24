package ch02;

class A{
    int age;
}

public class AMain {
    public static void main(String[] args) {
        A a = new A();
        a.age = 10;         // 10
        System.out.println(a+", a.age:"+a.age);     //10

        a = new A();        // 0
        System.out.println(a+", a.age:"+a.age);     //0

    }
}