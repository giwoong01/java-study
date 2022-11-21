package example7;

// 자바는 단일상속만 가능.
// 만약 다중상속이 하고싶다면, 포함시키면 가능하다.ㄴ

// class Tv {
//     boolean power;
//     int channel;
    
//     void power() { power = !power; }
//     void channelUp() { ++channel; }
//     void channelDown() { --channel; }
// }

class VCR {
    boolean power;
    int counter = 0;
    void power() {power = !power;}
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}

class exam4 extends Tv{
    VCR vcr = new VCR();
    // 자바는 다중상속을 허용하지 않으므로, 한클래스를 조상으로하고, 다른 클래스를 포함한다.

}
