package twoTask;

import java.util.Scanner;

public class AppleAndIvan {
    public static void main(String[] args) {
        System.out.println("Введите число яблок: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfApples = scanner.nextInt();
        getAppleAddition(numberOfApples, "Иван");
    }

    public static void getAppleAddition(int num, String name) {
        int a = num % 10;
        int b = num % 100;
        String apple;
        if (a == 1 && b != 11) {
            apple = "яблоко";
        } else if (a >= 2 && a <= 4 && !(b >= 12 && b <= 14)) {
            apple = "яблока";
        } else {
            apple = "яблок";
        }
        System.out.println(name + " хранит " + num + " " + apple + ".");
    }
}