package z2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество элементов массива: ");
            int size = scanner.nextInt();

            byte[] array = new byte[size];
            System.out.println("Введите элементы типа byte (от -128 до 127):");

            int checkSum = 0;
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextByte();
                checkSum += array[i];
            }

            // Искусственный перехват переполнения диапазона byte
            if (checkSum < Byte.MIN_VALUE || checkSum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Переполнение! Итоговая сумма (" + checkSum + ") вышла за допустимые границы типа byte.");
            }

            System.out.println("Итоговая сумма элементов: " + (byte) checkSum);

        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Введена строка, либо число не вмещается в диапазон типа byte.");
        } catch (ArithmeticException e) {
            System.err.println("Ошибка расчетов: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: Работа с массивом byte завершена.");
            scanner.close();
        }
    }
}