public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // начальная сумма
        int populationAmount = 800 ; // сумма пополнения
        int totalAmount = initialAmount + populationAmount; // сумма на счету после пополнения
        int bonusAmount = totalAmount / 100; // начисленный бонус за каждые 100 рублей
        int totalMany = bonusAmount + totalAmount;
        if (totalAmount >=1000){
                System.out.println("Денег на счету " + totalMany);
        } else {
            System.out.println("Денег на счету " + totalAmount);
        }


    }
}
