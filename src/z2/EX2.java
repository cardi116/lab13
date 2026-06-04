package z2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть больше нуля!");
            }

            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0; int count = 0;
            for (int num : array) {
                if (num > 0) { sum += num; count++; }
            }

            if (count == 0) {
                throw new ArithmeticException("Положительные элементы отсутствуют. Вычисление невозможно.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Вместо числовых данных введена строка.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("Ошибка логики: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: Ресурсы системы освобождены.");
            scanner.close();
        }
    }
}