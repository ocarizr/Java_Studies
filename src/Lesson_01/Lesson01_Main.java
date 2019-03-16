package Lesson_01;

import java.util.Locale;
import java.util.Scanner;

public class Lesson01_Main {
    public void main() {
        System.out.println("Products:");
        String product1 = "Computer";
        float price1 = 1500f;
        System.out.printf("%s, which price is $%.2f %n", product1, price1);
        String product2 = "TV";
        double price2 = 650.5;
        System.out.printf("%s, which price is $%.2f %n", product2, price2);

        System.out.println();
        int age = 28;
        int code = 5290;
        char gender = 'M';
        System.out.printf("Record: %d years old, code %d and gender %s %n", age, code, gender);

        System.out.println();
        Boolean reliable = true;
        System.out.println("Is this information reliable? " + (reliable ? "It is" : "It isn't"));

        Locale.setDefault(Locale.CANADA);
        System.out.println();
        System.out.printf("I can sell your %s for $%.2f %n", product1, price1);

        System.out.println();
        float sum = sum(price1, (float) price2);
        System.out.printf("The total price is $%.2f %n", sum);
    }

    private float sum(float a, float b) {
        return a + b;
    }

    public void scannerTest() {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.println(sentence);
        System.out.println(first + " " + second + " " + third);
        first = scanner.next();
        second = scanner.next();
        third = scanner.next();
        System.out.println(first + " " + second + " " + third);

        scanner.close();
    }
}
