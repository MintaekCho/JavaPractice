package Collection;

public class Generic {
    public static void main(String[] args) {
        Coffee<String> coffee = new Coffee<>("카페라떼");
        System.out.println(coffee.getCoffee());
    }
}
class Coffee<T>{
    private T coffee;
    private int coffeeNumber;

    public Coffee(T coffee) {
        this.coffee = coffee;
    }

    public T getCoffee() {
        return coffee;
    }

    public void setCoffee(T coffee) {
        this.coffee = coffee;
    }
}
