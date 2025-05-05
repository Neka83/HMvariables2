//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 30;
        byte level = 90;
        short year = 2025;
        long population = 1000000L;
        float temperature = 35.5f;
        double x = 3.1234;

        System.out.println("Значение переменной аge с типом int равно " + age);
        System.out.println("Значение переменной level с типом byte равно " + level);
        System.out.println("Значение переменной year с типом short равно " + year);
        System.out.println("Значение перменной population с типом long равно " + population);
        System.out.println("Значение перменной temperature с типом float равно " + temperature);
        System.out.println("Значение переменной x с типом double равно " + x);

        // task 2

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

       // task 3

        int studentsL = 23;
        int studentsA = 27;
        int studentsE = 30;

        int totalStudents = studentsL + studentsA + studentsE;
        int totalPaper = 480;

        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги.");

       // task 4

        int bottlesPerMinute = 8;

        int bottlesIn20Min = bottlesPerMinute * 20;
        int bottlesIn1Day = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesIn1Day * 3;
        int bottlesInMonth = bottlesIn1Day * 30;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " штук бутылок.");
        System.out.println("За три дня машина произела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За месяц машина произела " + bottlesInMonth + " штук бутылок");

        // task 5

        int totalPaint = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int paintPerClass = whitePerClass + brownPerClass;
        int numberOfClasses = totalPaint / paintPerClass;

        int totalWhite = numberOfClasses * whitePerClass;
        int totalBrown = numberOfClasses * brownPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

        // task 6

        int bananaCount = 5;
        int bananaWeightPerUnit = 80;
        int totalBananaWeight = bananaCount * bananaWeightPerUnit;

        int milkMl = 200;
        double milkWeightPerMl = 1.05;
        double totalMilkWeight = milkMl * milkWeightPerMl;

        int iceCreamCount = 2;
        int iceCreamWeightPerUnit = 100;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeightPerUnit;

        int eggCount = 4;
        int eggWeightPerUnit = 70;
        int totalEggWeight = eggCount * eggWeightPerUnit;

        double totalGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;

        double totalKg = totalGrams / 1000;

        System.out.println("Общий вес спортзавтрака: " + totalGrams + " грамм");
        System.out.println("Это примерно: " + totalKg + " килограмма");

        // task 7

        int totalGramsToLose = 7000;
        int minDailyLoss = 250;
        int maxDailyLoss = 500;

        int daysMinLoss = totalGramsToLose / minDailyLoss;
        int daysMaxLoss = totalGramsToLose / maxDailyLoss;

        double averageDays = (daysMinLoss + daysMaxLoss) / 2.0;

        System.out.println("Если терять по 250 г в день, потребуется " + daysMinLoss + " дней. ");
        System.out.println("Если терять по 500 г в день, потребуется " + daysMaxLoss + " дней.");
        System.out.println(" В среднем потребуется " + averageDays + " дней.");

        // task 8

        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double increasePercentage = 0.1;

          // уеличение зарплаты

        double increasePercentageSalaryMasha = salaryMasha * increasePercentage;
        double increasePercentageSalaryDenis = salaryDenis * increasePercentage;
        double increasePercentageSalaryKristina = salaryKristina * increasePercentage;
          // новая зарплата

        double newSalaryMasha = salaryMasha + increasePercentageSalaryMasha;
        double newSalaryDenis = salaryDenis + increasePercentageSalaryDenis;
        double newSalaryKristina = salaryKristina + increasePercentageSalaryKristina;

        // разница в годовом доходе

        double annualDifferenceMasha = increasePercentageSalaryMasha * 12;
        double annualDifferenceDenis = increasePercentageSalaryDenis * 12;
        double annualDifferenceKristina = increasePercentageSalaryKristina * 12;

        System.out.println ("Маша теперь получает " +newSalaryMasha+ " рублей в месяц. Годовой доход вырос на " +annualDifferenceMasha + " рублей.");
        System.out.println ("Денис теперь получает " + newSalaryDenis + " рублей в месяц. Годовой доход вырорс на " + annualDifferenceDenis + " рублей.");
        System.out.println ("Кристина теперь получает " + newSalaryKristina + " рублей в месяц. Годовой доход вырос на  " + annualDifferenceKristina + " рублей.");
    }
}
