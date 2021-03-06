package animals;
import java.util.Scanner;

public class createAnimal {


    Scanner myScanner = new Scanner(System.in);

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " this is not an animal we can currently create, please try again.");
        }
    }

    public void createCat() {
        System.out.println("Cat created!");
    }

    public void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = Integer.parseInt(myScanner.nextLine());

        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();

        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);
    }

    public static void main(String[] args) {
        createAnimal c= new createAnimal();
        c.createDog();
    }
}