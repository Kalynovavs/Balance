public class Main {
    public static void main(String[] args) {
        double balance = 500.50;// начальный счет
        double topUpYourPhone = 2100.50;// сумма пополнения
        if (topUpYourPhone > 1000) {
            balance = balance + topUpYourPhone + ((int)topUpYourPhone / 100);
        } else {
            balance = balance + topUpYourPhone;
        }
        System.out.println(balance);
    }
}