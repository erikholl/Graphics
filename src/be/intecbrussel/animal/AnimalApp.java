package be.intecbrussel.animal;

public class AnimalApp {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        Fish myFish = new Fish();
        Cat myCat = new Cat();
        Snake mySnake = new Snake();

        System.out.println(myBird.getName());
        System.out.println(myFish.getName());
        System.out.println(myCat.getName());
        System.out.println(mySnake.getName());
        myBird.move();
        myFish.move();
        myCat.move();
        mySnake.move();
        myBird.makeNoise();
        myFish.makeNoise();
        myCat.makeNoise();
        mySnake.makeNoise();
    }
}
