package example6;

class Product {
    static int count = 0;
    int serialNo;
    {                  // 인스턴스가 생성될 때 마다 count++
        ++count;
        serialNo = count;
    }
    public Product(){} // 기본 생성자
}
public class exam29 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
        System.out.println(Product.count);
    }
}
