// Marouane, Mustafa, Erik

package be.intecbrussel.animal;

public class Cat extends Animal {
    // constructors
    public Cat() {
        this("Rachid");
    }

    public Cat(String name) {
        super.setName(name);
    }

    // methods
    @Override
    public void move() {
        System.out.println("Cat moves");
    }

    @Override
    public void makeNoise() {
        System.out.println("Miaaauw");
    }
}
