public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
    }

    class CarEx {
        public  int a = 10;
        public int b = 20;

        public void axcel(){
            System.out.println(a);
            System.out.println(b);
        }

        public  void axcel2(){
            System.out.println(a);
           // System.out.println(b);
          //  b = 400; 인스턴스 변수는 클래스 메서드에서 사용할 수 없으므로 에러가 발생한다.
        }
    }
}
