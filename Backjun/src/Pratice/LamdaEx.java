package Pratice;

public class LamdaEx {
    public static void main(String[] args) {
        MaxFuctional lamdaEx;
        lamdaEx =  Math :: max;
       int result =  lamdaEx.maxresult(5,6);
        System.out.println(result);

        int result1 = lamdaEx.maxresult(70, 9);
        System.out.println(result1);

        lamdaEx = (a,b) -> a + b;
        int result2 = lamdaEx.maxresult(10,17);
        System.out.println(result2);
    }

}
    @FunctionalInterface
     interface MyfunctionalInterface{
        public void accept();
    }

    @FunctionalInterface
    interface MaxFuctional{
    public int maxresult(int a, int b);
    }

