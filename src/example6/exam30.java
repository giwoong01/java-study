package example6;

class Document{
    static int count = 0;
    String name;

    Document(){
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + " 생성");
    }
}
public class exam30 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }   
}
