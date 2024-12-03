public class Zadanie5 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("ключ null в getDetails");
        }
        System.out.println("Данные для ключа: " + key);
    }

    public static void main(String[] args) {
        Zadanie5 demo = new Zadanie5();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}