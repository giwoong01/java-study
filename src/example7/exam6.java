package example7;

// super는 조상클래스로 부터 상속받은 멤버변수를 뜻한다.
// this는 자손클래스에 선언된 멤버변수를 뜻한다.

public class exam6 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}
class Parent2 {
    int x = 10;
}
class Child2 extends Parent2 {
    int x = 20;
    void method() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

