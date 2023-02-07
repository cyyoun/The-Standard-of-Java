package Lambda;

@FunctionalInterface
interface MyFunction{
    void run(); //public abstract void run();
}

class LambdaEx1 {
    //매개변수 타입이 MyFunction인 메서드
    static void execute(MyFunction f){
        f.run();
    }

    //반환타입이 MyFunction인 메서드
    static MyFunction getMyFunction() {
        MyFunction f = () -> System.out.println("f3.run");
        return f;
    }

    public static void main(String[] args){
        MyFunction f1 = () -> System.out.println("f1.run");


        //익명클래스로 run() 구현
        MyFunction f2 = new MyFunction() {
            @Override
            public void run() { //반드시 public을 붙여야 함...(!)
                System.out.println("f2.run");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));

    }
}

