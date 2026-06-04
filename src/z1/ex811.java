package z1;
public class ex811 {
    public static int m8() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static int m9() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }

    public static int m10() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20; // Перезапишет предыдущий return 15
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Пример 8 ---");
        try {
            m8();
        } catch (RuntimeException e) {
            System.out.println("Исключение из m8 обработано в main");
        }

        System.out.println("\n--- Пример 9 ---");
        System.out.println("Результат: " + m9());

        System.out.println("\n--- Пример 10 ---");
        System.out.println("Результат: " + m10());

        System.out.println("\n--- Пример 11 ---");
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}