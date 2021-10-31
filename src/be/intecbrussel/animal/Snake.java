package be.intecbrussel.animal;

public class Snake extends Animal  {

    public Snake() {
        this("Joe");
    }

    public Snake(String name) {
        super.setName(name);
    }

    @Override
    public void move() {
        System.out.println("snakemove");
    }

    @Override
    public void makeNoise() {
        System.out.println("ssssssssshhhhhh");;
    }
}
