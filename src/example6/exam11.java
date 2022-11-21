package example6;

public class exam11 {
    public static void main(String[] args) {
    int[] x = {10}; // 크기가 1인 배열 x[0] = 10
    System.out.println(x[0]);

    change(x);
    System.out.println(x[0]);
    }

    static void change(int[] x){
        x[0] = 1000;
        System.out.println(x[0]);
    }
}