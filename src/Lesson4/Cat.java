package Lesson4;

public class Cat extends Animal {
    public static int catCount = 0;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);

        this.appetite = appetite;
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + "пробежал " + distance + "метров");
        } else {
            System.out.println(name + "не может пробежать " + distance + "метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + "не умеет плавать ");
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(name + "поел ");
        } else {
            System.out.println(name + "не покушал.");
        }
    }

    public void printInfo() {
        System.out.println(
                "Кот:" + name +
                        ", сытость" + satiety
        );
    }
}

