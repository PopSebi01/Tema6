package Course6HW;

public class Bottle {
    public int totalCapacity = 1000;
    public int availableLiquid = 500;
    public boolean open = true;

    public boolean isOpen() {
        if(open==true){
            System.out.println("Cum deschizi sticla daca e deja deschisa?");
        }else{
        System.out.println("Bottle is opened");
        }
        return open=true;

    }
    public boolean isClosed(){
        System.out.println("Bottle is closed");
        return open = false;
    }

    Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }


    public int getAvailableLiquid() {
        return availableLiquid;
    }
    public boolean overflow(){
        return availableLiquid>totalCapacity;
    }
    public int emptyCapacity(){
        return totalCapacity-availableLiquid;
    }
    public void drink(int a){
        availableLiquid = availableLiquid-a;
        if(open == false){
            System.out.println("You can't dirnk from an closed bottle dummy");
        }
        if(a>availableLiquid){
            System.out.println("Baga pana crapi");
        }
    }



}
