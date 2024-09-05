public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int month = 1;
        int salary = 15_000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
        //System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        System.out.println();

        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        int y = 12_000_000;
        int birthRate, deathRate;
        for (int year = 1; year <= 10; year++) {
            birthRate = 17 * y / 1000;
            deathRate = 8 * y / 1000;
            y = y + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }
        System.out.println();

        System.out.println("Задача 4");
        int sum = 15_000;
        month = 1;
        while (sum < 12_000_000) {
            sum = sum + 7 * sum / 100;
            System.out.println(month + " месяц, сумма накоплений составла " + sum);
            month++;
        }
        System.out.println();

        System.out.println("Задача 5");
        sum = 15_000;
        month = 1;
        while (sum < 12_000_000) {
            sum = sum + 7 * sum / 100;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, сумма накоплений составла " + sum);
            }
            month++;
        }
        System.out.println();

        System.out.println("Задача 6");
        sum = 15_000;
        month = 1;
        while (month <= 12 * 9) {
            sum = sum + 7 * sum / 100;
            if (month % 6 == 0) {
                System.out.println("Через " + month + " месяцев, сумма накоплений = " + sum);
            }
            month++;
        }
        System.out.println();

        System.out.println("Задача 7");
        int friday = 7;
        for (int day = 1; day <= 31; day++) {
            if (day == friday) {
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет.");
                friday = day + 7;
            }
        }
        System.out.println();

        System.out.println("Задача 8");
        int currentYear = 2024;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (; beforeYear <= afterYear; beforeYear++) {
            if (beforeYear % 79 == 0) {
                System.out.println(beforeYear);
            }
        }
    }
}