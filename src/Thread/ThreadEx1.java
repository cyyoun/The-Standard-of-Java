package Thread;

public class ThreadEx1 {
    public static void main(String[] args){
//        ThreadEx1_1 t1=  new ThreadEx1_1();
//        // Runnable클래스의 인스턴스를 생성한 다음, 이 인스턴스를 Thread 클래스의 생성자의 매개변수로 제공해야 함
//        Runnable r = new ThreadEx1_2();
//        Thread t2 = new Thread(r);
//
//        t1.start();
//        t2.start();
        for(int i=0; i<500; i++){
            System.out.print(0);
        }
        for(int i=0; i<500; i++)  {
            System.out.print(1);
        }
    }
}
class ThreadEx1_1 extends Thread{
    public void run(){

    }
}
class ThreadEx1_2 implements Runnable{
    public void run(){

    }
}