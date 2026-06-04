package z1;

public class ex12to14 {
    public static void m12(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void m14(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        System.out.println("--- Пример 12 ---");
        try {
            m12(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

        System.out.println("\n--- Пример 13 ---");
        try {
            // Имитируем пустой массив аргументов args
            String[] mockArgs = new String[0];
            int l = mockArgs.length;
            System.out.println("размер массива= " + l);
            int h = 10 / l; // Будет деление на ноль
            mockArgs[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }

        System.out.println("\n--- Пример 14 ---");
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m14(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}