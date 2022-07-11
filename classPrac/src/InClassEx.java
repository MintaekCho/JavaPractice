public class InClassEx {
    public static void main(String[] args) {
        Outclass test = new Outclass();
        test.test2();
    }
}

class Outclass{
    int num = 10;
    static int num1 = 5;
    void intest(){
        System.out.println(num);
    }

    private InClass inclass;
    Outclass(){
         inclass = new InClass();
    }

    class InClass {
        int inNum = 1;

        // static int inNum1 = 2;
        void test() {
            System.out.println(10);
        }
    }
    public void test2() {
        inclass.test();
    }
}
