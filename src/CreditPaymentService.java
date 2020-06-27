public class CreditPaymentService {
    public double calculate(double years, double amount, double rate) {
        double month = years * 12;                             // Определяется количество месяцев.
        double percentRatio = rate / 100 / 12;                 // Месячная % ставка по кредиту.
        double degree = Math.pow(1 + percentRatio, month);              // Расчет степени в формуле Коэффициент. аннуитета
        double annuityRatio = ((percentRatio * degree) / (degree - 1)); // Коэффициент аннуитета
        double payment = Math.round(amount * annuityRatio);             // Ежемесячный платеж
        return payment;
    }
}