package Lesson3;

public class product {
    String name;
    String manufactureDate;
    String manufacturer;
    String country;
    double price;
    boolean isReversed;

    public product(String name, String manufactureDate, String manufacturer, String county, double price, boolean isReversed) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = county;
        this.price = price;
        this.isReversed = isReversed;

    }
public void displayInfo() {
    System.out.println("=== Информация о товаре ===");
    System.out.println("Название: " + name);
    System.out.println("Дата производства: " + manufactureDate);
    System.out.println("Производитель: " + manufacturer);
    System.out.println("Страна происхождения: " + country);
    System.out.println("Цена: " + price + " руб.");
    System.out.println("Забронирован: " + (isReversed ? "Да" : "Нет"));
    System.out.println("============================"); }
}
