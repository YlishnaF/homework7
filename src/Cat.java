public class Cat {
    String name;
    final int APPETITE = 10;
    final boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(APPETITE, satiety);


    }



}