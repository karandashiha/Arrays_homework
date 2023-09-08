package app;


public class Main {
    static String products[];
    static String pattern;
    static int count;


    public static void main(String[] args) {

        // Закупівельний набір
        products = new String[]{"espresso", "latte", "cappuccino", "flat white", "iced-latte", "espresso"};

        pattern = "espresso";
        System.out.println("The list of products\n");

        // Виведення товарів
        count=0;
        for (String name : products) {
            count++;
            System.out.println(count + ") " + name);
        }

        System.out.println("------------------------------");

        // Пошук найменування товару
        count=0;
        for (String name : products) {
            if (name.equals(pattern)) {
                count++;
                System.out.println(count + ") " + name);
            }
        }
        if (count > 0)
            System.out.println("Found " + pattern + ": " + count);
        if (count == 0)
            System.out.println("Not found");

    }
}
