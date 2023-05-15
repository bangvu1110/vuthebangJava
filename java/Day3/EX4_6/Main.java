package Day3.EX4_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mèo");
        Cat cat = new Cat("cat 1");
        Mammal mammal = new Mammal("chó");
        Dog dog = new Dog("dog 1");
        Dog dog2 = new Dog("dog 2");

        System.out.println("Animal: "+ animal.toString());
        System.out.println("Cat: "+cat.toString());
        System.out.print("Cat greets: ");
        cat.greets();
        System.out.println("Mammal: "+ mammal.toString());
        System.out.println("Dog 1: "+dog.toString());
        System.out.print("Dog 1 greets: ");
        dog.greets();
        System.out.println("Dog 2: "+dog2.toString());
        System.out.print("Dog 2 greets: ");
        dog2.greets(dog);



    }
}
