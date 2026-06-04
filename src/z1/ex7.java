package z1;
public class ex7 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
                throw new ArithmeticException(); // Вылетает наружу текущего try-catch
            } catch (ArithmeticException e) {
                System.out.println("2");
            }
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено во внешнем блоке: ArithmeticException");
        }
        System.out.println("3");
    }
}