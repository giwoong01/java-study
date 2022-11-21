package example6;

// 초기화 블럭
public class exam27 {
    static {
        System.out.println("클래스 초기화 블럭");
    }
    {
        System.out.println("인스턴스 초기화 블럭");
    }
    public exam27(){
        System.out.println("생성자");
    }
    public static void main(String[] args) {
        System.out.println("exam27 ex = new exam27();");
        exam27 ex = new exam27();

        System.out.println("exam27 e2 = new exam27();");
        exam27 e2 = new exam27();
    }
}
