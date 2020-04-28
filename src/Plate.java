public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food : "+ food);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount, boolean fullness) {
        if(amount > food){
            System.out.println("Еды для кота недостаточно!");
            return;
        }
        food -= amount;
        System.out.println("Кот поел и доволен!");
        fullness = true;

    }

    public void increaseFood(){
        food +=food;
    }
}
