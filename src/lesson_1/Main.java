package lesson_1;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a, b;
        a = 10;
        b = 5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 10;
        if (value >= 0) {
            System.out.println("Красный");
        }
        if (value > 0 || value <= 100) {
            System.out.println("Жёлтый");

        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

        static void compareNumbers() {
        int a = 5, b = 10;
        if (a>=b)
        {
        System.out.println("a>=b");
        }
        if (a<b)
        {
            System.out.println("a<b");
        }
    }
}
