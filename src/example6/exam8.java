package example6;

// 호출스택 순서
public class exam8 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) 시작");
        firstMethod(); // static 메서드에서는 객체 생성 없이 호출 가능하다.
        System.out.println("main(String[] args) 끝");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 끝");
    }
    static void secondMethod(){
        System.out.println("secondMethod() 시작");
        System.out.println("secondMethod() 끝");
    }
}
