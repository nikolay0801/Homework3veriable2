public class Main {
    public static void main(String[] args)
    {
       int masha = 67760;
       int denis = 83690;
       int kristina = 76230;
       double promotion = 0.1;
       double promotionMasha = promotion * masha;
        System.out.println("Повысилась зарплата Маши за 1 месяц" + promotionMasha + "руб");
        double promotionDenis = promotion * denis;
        System.out.println("Повысилась зарплата Дениса за 1 месяц " + promotionDenis + "руб");
        double promotionKristina = promotion * kristina;
        System.out.println("Повысилась зарплата Кристина за 1 месяц" + promotionDenis + "руб");
        int receivesPerYearsMasha = masha * 12;
        System.out.println("Маша получает в год " + receivesPerYearsMasha + "руб");
        int  receivesPerYearsDenis = denis * 12;
        System.out.println("Денис получает в год " + receivesPerYearsDenis + "руб");
        int  receivesPerYearsKristina = kristina * 12;
        System.out.println("Кристина  получает в год " + receivesPerYearsKristina + "руб");
        double interestPerYearMasha = promotionMasha * 12;
        System.out.println("Прибавка зарплаты в %  у Маши за год составила " + receivesPerYearsKristina + "руб");
        double interestPerYearDenis = promotionDenis * 12;
        System.out.println("Прибавка зарплаты в % у Дениса  за год составила " + interestPerYearDenis + "руб");
        double interestPerYearKristina = promotionKristina * 12;
    System.out.println("Прибавка зарплаты в % у Кристины  за год составила " + interestPerYearKristina  + "руб");
    double nowMashagets = receivesPerYearsMasha + interestPerYearMasha ;
        System.out.println("Маша теперь получает"+ nowMashagets + "Годовой доход вырос на "+ interestPerYearMasha +"Рублей");
        double nowDenisgets = receivesPerYearsDenis + interestPerYearDenis;
        System.out.println("Денис теперь получает"+ nowDenisgets  + "Годовой доход вырос на "+ interestPerYearDenis +"Рублей");
        double nowKristinagets = receivesPerYearsKristina + interestPerYearKristina;
        System.out.println("Кристина теперь получает"+  nowKristinagets + "Годовой доход вырос на "+ interestPerYearKristina +"Рублей");
    }

}