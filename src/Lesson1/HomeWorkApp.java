package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if (a + b >= 0)
            System.out.println("Сумма положительна");
        else {
            System.out.println("Cумма отрицательна");
        }
    }

    public static void printColor(){
        int value = 10;
        if (value <= 0)
            System.out.println("Красный");
        if (value > 0 && value <= 100 )
            System.out.println("Желтый");
        if (value > 100)
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = -10, b = -6;
        if (a >= b)
            System.out.println("a >= b");
        else {
            System.out.println("a < b");
        }
    }
}
