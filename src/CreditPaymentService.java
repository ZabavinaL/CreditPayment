public class CreditPaymentService {
    public long calculate(long credit_amount){

        float percent = 9.99F; // процент по кредиту (в год)
        float month_percent = 9.99F / 100 / 12; // процентная ставка (в месяц) = 0.008325
        float year1 = 1.1046035141003447F; // результат возведения в степень 1 год: (1 + 0,008325)^12
        float year2 = 1.2201489233628302F; // результат возведения в степень 2 года: (1 + 0,008325)^24
        float year3 = 1.3477807884723345F; // // результат возведения в степень 3 года: (1 + 0,008325)^36

// формула расчета коэффициента аннуитета: 0,008325 × (1 + 0,008325)^12 / ((1 + 0,008325)^12 − 1) = 1.104603F
        float annuity_k_year1 = (month_percent * year1) / (year1 - 1); // коэффициент аннуитента year1
        float annuity_payment1 = credit_amount * annuity_k_year1; // расчет аннуитентного платежа year1
        long result1 = Math.round(annuity_payment1);

        float annuity_k_year2 = (month_percent * year2) / (year2 - 1); // коэффициент аннуитента year2
        float annuity_payment2 = credit_amount * annuity_k_year2; // расчет аннуитентного платежа year2
        long result2 = Math.round(annuity_payment2);

        float annuity_k_year3 = (month_percent * year3) / (year3 - 1); // коэффициент аннуитента year3
        float annuity_payment3 = credit_amount * annuity_k_year3; // расчет аннуитентного платежа year3
        long result3 = Math.round(annuity_payment3);

//        return result1;
        return result2;
//        return result3;
    }
}