package z1;

public class ex2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            // System.out.println("1"); // ОШИБКА КОМПИЛЯЦИИ: Недостижимый код!
        } catch (Exception e) {
            // Класс-предок Exception успешно перехватывает своего потомка
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}