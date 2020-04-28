import java.util.Random;

public class Cat {
    String name;

    Random random  = new Random();
    final int APPETITE= random.nextInt(50);
    final boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        System.out.println("Кот " + name + " ест...");
        plate.decreaseFood(APPETITE, satiety);

    }



}