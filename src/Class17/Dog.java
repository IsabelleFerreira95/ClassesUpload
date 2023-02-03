package Class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }
    void printInfo(){
        System.out.println("Name:"+name+" Breed:"+breed+" Color:"+color+" Age:"+age+" Weight:"+weight);
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Pepi","Mixed","brown",2,15);
       /*
       dog.name="Pepi";
        dog.breed="Mixed";
        dog.age=2;
        dog.weight=15;
        System.out.println(dog.name+dog.breed+dog.age+dog.weight);
        */
        dog.printInfo();
    }
}
