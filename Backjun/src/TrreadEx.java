public class TrreadEx {
    public static void main(String[] args) {
        Runnable test1 = new ThreadTest();
        Thread thread1 = new Thread(test1);
        thread1.start();

        for(int i = 0; i<100; i++){
            System.out.print('#');
        }
    }
}

class ThreadTest implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.print('@');
        }
    }
}
