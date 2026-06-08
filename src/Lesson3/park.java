package Lesson3;

public class park {
    public class Attraction {
        String name;
        String workingHours;
        double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("------------------------");
        }
    }
    public Attraction createAttraction(String name, String workingHours, double cost) {
        return new Attraction(name, workingHours, cost);
    }
}