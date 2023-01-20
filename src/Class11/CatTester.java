package Class11;

public class CatTester {
    public static void main(String[] args) {
        //Creating an object from the Cat class
        Cat cat1=new Cat();
        cat1.name="Taco";
        cat1.breed="Mixed";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Burrito";
        cat2.breed="mixed";
        cat2.color="White";
        cat2.speak();

        System.out.println(cat2.breed);

    }
}
