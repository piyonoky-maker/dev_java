package ch06;
// 자바에서는 같은 이름의 메서드를 여러개 선언할 수 있다
// ㅁ[삳, 오러라이딩  이거나 메서드 오버로딩 이면 가능함
public class A10 {
    void mehtodA(){
        System.out.println("methodA() 호출");
    }
    void mehtodA(String s){
        System.out.println("methodA(String) 호출");
    }
    void mehtodA(Boolean b){
        System.out.println("methodA(Boolean) 호출");
    }
    void mehtodA(int i, String name){
        System.out.println("methodA(int, String) 호출");
    }
    public static void main(String[] args) {
        A10 a = new A10();
        a.mehtodA();
        a.mehtodA("test");
        a.mehtodA(true);
        a.mehtodA(1, "test");
    }
}
