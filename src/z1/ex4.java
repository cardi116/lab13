package z1;
public class ex4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            // Пропускается
            System.out.println("1");
        } catch (Exception e) {
            // Срабатывает: полиморфизм позволяет предку обработать потомка
            System.out.println("2");
        } catch (Error e) {
            // Пропускается
            System.out.println("3");
        }
        System.out.println("4");
    }
}