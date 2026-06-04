package z2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); // Если ввести "тест" -> InputMismatchException

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0; int count = 0;
        for (int num : array) {
            if (num > 0) { sum += num; count++; }
        }
        // Если count == 0 -> ArithmeticException: / by zero
        int average = sum / count;
        System.out.println("Среднее: " + average);
    }
}