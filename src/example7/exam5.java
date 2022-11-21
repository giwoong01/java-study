package example7;

// 조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점 빼고는 this와 super는 근본적으로 같다.

public class exam5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
class Parent {
    int x = 10;
}
class Child extends Parent {
    void method() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
        // 모두 같은 값 출력
    }
}
