package example6;
 // memberCall
public class exam20 {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//  static int cv2 = iv; // 에러. 클래스변수는 인스턴스 변수를 사용할 수없음.
    static int cv2 = new exam20().iv; // 객체를 생성 후 사용 가능.

    static void staticMethod1(){
        System.out.println(cv);
//      System.out.println(iv); // 에러. 클래스 메서드에서 인스턴스변수 사용불가
        exam20 c = new exam20();
        System.out.println(c.iv); // 객체를 생성한 후 인스턴스 변수 사용가능.
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }
    
    static void staticMethod2(){
        staticMethod1();
//      instanceMethod1(); // 에러. 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없음.
        exam20 c = new exam20();
        c.instanceMethod1();
    }

    void instanceMethod2(){ // 인스턴스 메서드에서는 모두 호출 가능.
        staticMethod1();
        instanceMethod1();
    }
}
