package example6;

class MyMath2{
    long a,b;

    long add() {return a + b;}          // a, b 는 인스턴스 변수
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / b;}

    static long add(long a, long b) {return a + b;}          // a, b 는 지역 변수
    static long subtract(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(double a, double b) {return a / b;}
}

public class exam19 {
    public static void main(String[] args) {
        // 클래스 메서드를 이용하여 인스턴스를 생성하지 않고도 호출가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체를 생성 후에만 사용 가능
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
