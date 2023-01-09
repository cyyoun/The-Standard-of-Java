package OOP2;

class SuperClass {
    public SuperClass(String str){
        System.out.println(str + "호출");
    }
}

    class SubClass extends SuperClass{
        public SubClass() { // 자식 생성자
            super("어쩔티비");// 부모 생성자 호출
            System.out.println("자식 생성자 호출");
        }
    }

        public class overriding {
        public static void main(String[] args) {
            SubClass sc = new SubClass(); // 자식 인스턴스 생성
        }
    }
