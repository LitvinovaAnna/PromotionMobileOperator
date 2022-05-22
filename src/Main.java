public class Main {
    public static void main(String[] args) {
        int balance = 100; // текущий баланс клиента
        int replenishment = 1200; // сумма пополнения
        int bonus = replenishment / 100; // сумма бонусных рублей
        if (replenishment >= 1000) {
            System.out.println("Баланс " + ((balance) + (replenishment) + (bonus)));
        } else {
            System.out.println("Ваш баланс " + ((balance) + (replenishment)));
        }
    }
}
