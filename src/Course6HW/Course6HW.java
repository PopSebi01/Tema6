package Course6HW;

public class Course6HW {
    public static void main(String[] args) {
        Person Dorin = new Person("Dorin ", 19);
        System.out.print(Dorin.getName());
        System.out.print(Dorin.getAge());
        Dorin.setMarried(true);
        if (Dorin.isMarried()) {
            System.out.println(" Married");
        } else {
            System.out.println(" Not married");
        }


        Person Manu = new Person("Manu ", 14);
        System.out.print(Manu.getName());
        System.out.print(Manu.getAge());
        Manu.setMarried(false);
        if (Manu.isMarried()) {
            System.out.println(" Married");
        } else {
            System.out.println(" Not married");
        }

        Person Sebi = new Person("Sebi ", 33);
        System.out.print(Sebi.getName());
        System.out.print(Sebi.getAge());
        Sebi.setMarried(true);
        if (Sebi.isMarried()) {
            System.out.print(" Married");
        } else {
            System.out.print(" Not married");
        }
    }
}
