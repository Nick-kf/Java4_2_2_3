public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Срок кредита 1 год
        double years = 1;                            // срок кредита
        double amount = 1_000_000;                   // сумма кредита
        double rate = 9.99;                          // % ставка
        double payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));
        // Срок кредита 2 года
        years = 2;                                   // срок кредита
        amount = 1_000_000;                          // сумма кредита
        rate = 9.99;                                 // % ставка
        payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));
        // Срок кредита 3 года
        years = 3;                                  // срок кредита
        amount = 1_000_000;                         // сумма кредита
        rate = 9.99;                                // % ставка
        payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));

    }
}