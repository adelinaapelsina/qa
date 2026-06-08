package Lesson3;

public class Main {
    public static void main(String[] args) {
        product[] productsArray = new product[5];

        productsArray[0] = new product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599.99, true);

        productsArray[1] = new product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 79999.99, false);

        productsArray[2] = new product("Xiaomi 14 Ultra", "10.01.2025",
                "Xiaomi Corp.", "China", 34999.99, true);

        productsArray[3] = new product("Google Pixel 9", "20.02.2025",
                "Google LLC", "USA", 62999.99, false);

        productsArray[4] = new product("Sony Xperia 1 VI", "05.04.2025",
                "Sony Corp.", "Japan", 89999.99, true);

        System.out.println("Список всех товаров:\n");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар №" + (i + 1));
            productsArray[i].displayInfo();
            System.out.println();
        }
    }
}