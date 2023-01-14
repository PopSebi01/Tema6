package Course6HW;

public class Course6HWBottle {
    public static void main(String[] args) {
        Bottle myBottle = new Bottle(1000,300, false);
        myBottle.drink(100);
        myBottle.getAvailableLiquid();
        myBottle.overflow();
        myBottle.isOpen();
        myBottle.isOpen();
        myBottle.isClosed();
        myBottle.emptyCapacity();
        System.out.println(myBottle.getAvailableLiquid());
        myBottle.drink(1000);


}


    }

