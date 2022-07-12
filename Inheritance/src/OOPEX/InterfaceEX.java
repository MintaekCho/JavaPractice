package OOPEX;

public class InterfaceEX {
    public static void main(String[] args) {
        Employee host = new Employee();
        Customer customer = new Customer(50000);

        host.buyCoffey(new Coffey("에이드", 5000));
        host.todaySales();
        customer.customerInfo();

    }
}

class Employee implements BuyCoffey{
    int sales = 0;
    Employee(){

    }

    @Override
    public void buyCoffey(Coffey coffey) {
        sales += coffey.price;
        System.out.println(coffey.coffeyName + "를 판매하였습니다. 가격 : " + coffey.price + "원");
    }

    void todaySales(){
        System.out.println("오늘 매출은 " + sales + "원 입니다.");
    }
}

class Customer implements BuyCoffey{
    int money;
    Customer(int money){
        this.money = money;
    }

    @Override
    public void buyCoffey(Coffey coffey) {
        money -= coffey.price;
        System.out.println(coffey.coffeyName + "를 구매하였습니다. 가격 : " + coffey.price + "원");
    }

    void customerInfo(){
        System.out.println("남은돈 : " + money + "원");
    }


}

class Coffey{
    String coffeyName;
    int price;
    Coffey(String coffeyName, int price){
        this.coffeyName = coffeyName;
        this.price = price;
    }
}

interface BuyCoffey{
    void buyCoffey(Coffey coffey);
}


