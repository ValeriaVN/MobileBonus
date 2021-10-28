public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int account = 100;
        int refills = 1300;
        int bonus;

        if (refills > 1000) {
            bonus = refills / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = account + refills + bonus;
        System.out.println(finalAccount);
    }
}
