package OOP2;

class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCation(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args){
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCation("Hello~");
        ctv.caption = true;
        ctv.displayCation("Hello~");

    }
}
