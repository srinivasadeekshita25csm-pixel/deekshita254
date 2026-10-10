package basics;
class FarmAnimal {

    String name;
    String stay;
    String food;
    String sound;

    FarmAnimal(String name, String stay, String food, String sound) {
        this.name = name;
        this.stay = stay;
        this.food = food;
        this.sound = sound;
    }

    void displayDetails() {
        System.out.println("Animal: " + name);
        System.out.println("Stays in: " + stay);
        System.out.println("Eats: " + food);
        System.out.println("Sound: " + sound);
        System.out.println();
    }
}

public class FarmAnimals {
    public static void main(String[] args) {

        FarmAnimal cow = new FarmAnimal("Cow", "Cowshed", "Grass", "Moo");
        FarmAnimal pig = new FarmAnimal("Pig", "Pigsty", "Grains", "Oink");
        FarmAnimal horse = new FarmAnimal("Horse", "Stable", "Grass", "Neigh");

        cow.displayDetails();
        pig.displayDetails();
        horse.displayDetails();
    }
	

}
