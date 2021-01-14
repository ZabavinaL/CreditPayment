
//0,008325 × (1 + 0,008325)^12 / ((1 + 0,008325)^12 − 1)
public class CreditPaymentService {
    public long calculate(long amount, int month) {

        double month_percent = 9.99F / 100 / 12; // процентная ставка (в месяц) = 0.008325

        double a = 1.008325;
        int b = month;
        double c = Math.pow(a,b);

        double annuity_k = (month_percent * c) / (c - 1);
        double annuity_payment = amount * annuity_k;
        long result = Math.round(annuity_payment);

        return result;
    }
}