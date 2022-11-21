package example6;

// 호출스택
public class exam7 {
    public static void main(String[] args) {
        firstMethod(); // static 메서드에서는 객체 생성 없이 호출 가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
