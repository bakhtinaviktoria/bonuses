public class Main {
    public static void main(String[] args) {
        int ticketPrice = 8_964;  // стоимость билета
        int rubles = 20; // кол-во рублей для одной бонусной мили

        int miles = ticketPrice / rubles; // расчет миль
        System.out.println("Начислено " + miles + " миль");
    }
}
