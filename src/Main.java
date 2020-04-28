public class Main {
    public static void main(String[] args) {
        Cat [] cats = new Cat[4];
        cats[0] = new Cat ("Мурзик");
        cats[1] = new Cat ("Пушистик");
        cats[2] = new Cat ("Капитан мохнатые ботинки");
        cats[3] = new Cat ("Мистр Котэ");

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("Аппетит котика на сегодня: " + cats[i].APPETITE);
        }

        plate.info();
        plate.increaseFood();
        plate.info();





    }
}
