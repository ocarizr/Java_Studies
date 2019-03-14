package Lesson_1;

import java.util.Locale;

public class Main {
    String product1 = "Computer";
    String product2 = "TV";

    int age = 28;
    int code = 5290;
    char gender = 'M';

    float price1 = 1500f;
    double price2 = 650.5;
    Boolean reliable = true;

    public void main() {
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f %n", product1, price1);
        System.out.printf("%s, which price is $%.2f %n", product2, price2);

        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender %s %n", age, code, gender);

        System.out.println();
        System.out.println("Is this information reliable? " + (reliable ? "It is" : "It isn't"));

        Locale.setDefault(Locale.CANADA);
        System.out.println();
        System.out.printf("I can sell your %s for $%.2f %n", product1, price1);

        System.out.println();
        float sum = Sum(price1, (float) price2);
        System.out.printf("The total price is $%.2f", sum);
    }

    private float Sum(float a, float b) {
        return a + b;
    }

}
