// Uneys, Zuhur

package be.intecbrussel.animal;

public class Fish extends Animal {
    // constructors
    public Fish(){
        this("Gluglu");
    }

    public Fish(String name) {
        super.setName(name);
    }

    // methods
    @Override
    public void move() {
        System.out.println("Fish swims");
    }

    @Override
    public void makeNoise() {
        System.out.println("glu glu");
    }
}
