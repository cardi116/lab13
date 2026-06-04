package z2;

import java.util.Scanner;

public class EX5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = scanner.nextInt();

        byte[] array = new byte[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextByte(); // Ввод 500 или "абв" -> InputMismatchException
            sum += array[i];
        }
        // Переполнение типа byte (например сумма 200) никак не прерывает программу автоматически!
        System.out.println("Сумма: " + (byte)sum);
    }
}