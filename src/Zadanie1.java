public class Zadanie1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }

    public static void main(String[] args) {
        Zadanie1 example = new Zadanie1();
        example.exceptionDemo();
    }
}