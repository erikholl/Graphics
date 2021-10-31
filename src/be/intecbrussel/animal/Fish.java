package be.intecbrussel.animal;

public class Fish extends Animal {

    public Fish(){
        this("Gluglu");
    }
    public Fish(String name) {
        super.Animal(name);
    }



    public void move() {
        System.out.println("Fish swims");
    }



    public void makeNoise() {
        System.out.println("glu glu");
    }
}
