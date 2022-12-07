public class Main {
    public static void main(String[] args) {
    Animal animal1 = new Animal("Luca");
    Lion lion1 = new Lion("Fuffy");
    Cow cow1 = new Cow("Mara");

    Animal[] zoo = {animal1, lion1, cow1};
    for(Animal animal : zoo)
        animal.animalSound();

    /* oppure:
    animal1.animalSound();
    lion1.animalSound();
    cow1.animalSound();*/
    }
}