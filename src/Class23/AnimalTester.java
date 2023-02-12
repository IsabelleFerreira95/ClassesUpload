package Class23;

public class AnimalTester {
    public static void main(String[] args) {
       /* Animal animal=new Animal() {
            @Override
            void speak() {

            }
        }*/
        Animal[]arr={new Cat(), new Dog()};
        for (Animal animal:arr){
            animal.speak();
            animal.sleep();
        }
    }
}
