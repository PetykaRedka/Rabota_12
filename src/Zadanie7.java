import java.util.Scanner;

    public class Zadanie7 {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Введите ключ: ");
                    String key = myScanner.nextLine();
                    printDetails(key);
                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    System.out.println("Попробуйте снова.");
                }
            }
            myScanner.close();
        }

        public void printDetails(String key) throws Exception {
            if (key.isEmpty()) {
                throw new Exception("Ключ установлен как пустая строка");
            }
            System.out.println("Данные для " + key);
        }

        public static void main(String[] args) {
            Zadanie7 demo = new Zadanie7();
            demo.getKey();
        }
    }
