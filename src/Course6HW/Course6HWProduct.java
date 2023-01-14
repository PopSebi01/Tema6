package Course6HW;

public class Course6HWProduct {
    public static void main(String[] args) {
        Product myProduct = new Product("Iaurt", 15, 0, "Lactate");
        Product myotherProduct = new Product("Pizza", 22, 3, "Pizza");
        Product myAnotherProduct = new Product("Lapte", 13, 3, "Lactate");

        System.out.println(myProduct.isCategory("Lactate")+" "+myProduct.hasStock());


        System.out.println(myotherProduct.isCategory("Lactate")+" "+myotherProduct.hasStock());


        System.out.println(myAnotherProduct.isCategory("Lactate")+" "+myAnotherProduct.hasStock());





    }
}
