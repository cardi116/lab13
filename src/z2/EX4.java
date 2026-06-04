package z2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        try {
            System.out.print("Введите номер столбца (от 0 до 2): ");
            int colIndex = scanner.nextInt();

            System.out.println("Элементы столбца:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][colIndex]);
            }

        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Неверный формат ввода. Требуется целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: Столбец с таким номером отсутствует в матрице.");
        } finally {
            System.out.println("Блок finally: Операция завершена.");
            scanner.close();
        }
    }
}