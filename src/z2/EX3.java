package z2;

import java.util.Scanner;

public class EX3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {{1, 2}, {3, 4}};

        System.out.print("Введите номер столбца: ");
        int col = scanner.nextInt(); // Строка вместо числа -> InputMismatchException

        // Если ввести индекс 5 -> ArrayIndexOutOfBoundsException
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][col]);
        }
    }
}