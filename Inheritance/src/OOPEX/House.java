package OOPEX;

public class House {
    public static void main(String[] args) {
        BasicHouse h1 = new BasicHouse();
        h1.openDoor();
        h1.closeDoor();

        HouseEx myhouse = new CustumHouse();
        myhouse.openDoor();
        myhouse.closeDoor();


        Door mydoor = new MyDoor();
        myhouse.setDoor(mydoor);
    }


}


interface Door{
    public void openDoor();
    public void closeDoor();
}

 class HouseEx {
    private String roof = "빨강지붕";
    private String window = "노랑창문";
    private String wall = "파랑벽";
    private Door door;

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void openDoor(){
        System.out.println("문을 엽니다.");
    }

    public void closeDoor(){
        System.out.println("문을 닫습니다.");
    }

}

class MyDoor implements Door{

    @Override
    public void openDoor() {
        System.out.println("개조된 문을 엽니다.");
    }

    @Override
    public void closeDoor() {
        System.out.println("개조된 문읃 닫습니다.");
    }
}

class BasicHouse extends HouseEx{

}

class CustumHouse extends HouseEx{
    @Override
    public void openDoor() {
        getDoor().openDoor();
    }

    @Override
    public void closeDoor() {
        getDoor().closeDoor();
    }
}