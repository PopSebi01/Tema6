package Course6HW;

public class Person {
    public String name = "Mircea";
    public int age = 20;
    public boolean married = true;

    public boolean isMarried() {
        return married;
    }


    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

}
