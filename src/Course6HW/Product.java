package Course6HW;

public class Product {
    public String name = "Lapte";
    public int price = 10;
    public int cantitate = 3;
    public String category = "Lactate";

    Product(String name, int price, int cantitate, String category) {
        this.name = name;
        this.price = price;
        this.cantitate = cantitate;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCantitate() {
        return cantitate;
    }
    public String getCategory(){
        return category;
    }
    public boolean isCategory(String cate){
        return category == cate;
    }

    public boolean hasStock(){
        return cantitate>0;
    }

}
