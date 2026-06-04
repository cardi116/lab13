package z1;

public class ex3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            // Пропускается, так как типы не совпадают
            System.out.println("1");
        } catch (RuntimeException e) {
            // Срабатывает, так как тип совпадает идеально
            System.out.println("2");
        } catch (Exception e) {
            // Пропускается, так как исключение уже обработано выше
            System.out.println("3");
        }
        System.out.println("4");
    }
}
