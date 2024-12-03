import java.util.Scanner;
    public class Zadanie2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            try {
                System.out.print("Введите целое число: ");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println("Результат: " + (2 / i));
            } catch (NumberFormatException e) {
                System.out.println("Ввод не является допустимым целым числом.");
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль недопустимо.");
            } finally {
                System.out.println("Программа завершена.");
                myScanner.close();
            }
        }

        public static void main(String[] args) {
            Zadanie2 example = new Zadanie2();
            example.exceptionDemo();
        }
    }
