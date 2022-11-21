package example6;

// 생성자

class Data1{
    int value;
}
class Data2{
    int value;
    
    Data2(int x){
        value = x;
    }
}

public class exam23 {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        //Data2 d2 = new Data2(); // compile error. 기본생성자인 Data2()가 아니라 Data2(int x) 라는 생성자가 있기때문이다.
    }
}
