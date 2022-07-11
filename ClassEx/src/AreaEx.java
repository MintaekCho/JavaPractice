public class AreaEx {
    public static void main(String[] args) {
        Area are = new Area();
        are.area(5);
        are.area(8, 15);
        are.area(10.0, 15.0);
    }
}
    class Area{

        public double area(int r){
            double result = 3.14 * r * r;
            System.out.println("원의 넓이는" + result + "입니다.");
            return result;
        }

        public int area(int w, int l){
            int result = w * l;
            System.out.println("직사각형의 넓이는" + result + "입니다.");
            return  result;
        }

        public double area(double b, double h ){
            double result = b * h *  0.5;
            System.out.println("삼각형의 넓이는" + result + "입니다.");
            return result;
        }
    }

