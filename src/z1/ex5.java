package z1;

public class ex5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { // Не перехватит RuntimeException
            System.out.println("1");
        }
        System.out.println("2");
    }
}