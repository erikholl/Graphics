package be.intecbrussel.animal;


public class Cat extends Animal {

    public Cat() {
        this("Rachid");
    }

    public Cat(String name) {
        super.setName(name);
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }


    @Override
    public void makeNoise() {
        System.out.println("Miaaauw");
    }
}
