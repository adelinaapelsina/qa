package Lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик ");
        Dog dog2 = new Dog("Собакен ");

        Cat cat1 = new Cat("Котек ", 10);
        Cat cat2 = new Cat("Коша ", 15);
        Cat cat3 = new Cat("Кошенька ", 20);

        System.out.println("Бег и плавание");
        dog1.run(400);
        dog1.swim(8);
        cat1.run(150);
        cat1.swim(5);

        System.out.println();
        System.out.println("Всего животных");
        System.out.println("Животных:" + Animal.animalCount);
        System.out.println("Собачек" + Dog.dogCount);
        System.out.println("Котиков:" + Cat.catCount);

        System.out.println();
        System.out.println("Корм");
        Plate plate = new Plate(30);
        plate.info();

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats){
            cat.eat(plate);
        }
        plate.info();

        System.out.println();

        System.out.println("Сытость котов");
        for (Cat cat : cats) {
            cat.printInfo();
        }

        System.out.println();
        System.out.println("Добавить еды:");
        plate.addFood(30);
        plate.info();
    }
}
