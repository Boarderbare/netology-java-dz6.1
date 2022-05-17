package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long sales[] = {5, 15, 10, 4, 16, 40, 13, 17, 6, 14, 30, 45};
        long sumTotalSales = service.sumTotalSales(sales);
        System.out.println("Сумма всех продаж " + sumTotalSales);
        float avgMonth=service.avgSalesPerMonth(sales);
        System.out.println("Средняя сумма продаж в месяц " +avgMonth);
        int monthHigh= (int) service.monthHighSales(sales);
        System.out.println("Месяц наибольших продаж " + monthHigh);
        int monthLow= (int) service.monthLowSales(sales);
        System.out.println("Месяц наменьших продаж " + monthLow);
        int countMonthLow= (int) service.countMonthLowSalesAvg(sales);
        System.out.println("Количество месяцев с продажами ниже среднего " + countMonthLow);
        int countMonthUp= (int) service.countMonthUpSalesAvg(sales);
        System.out.println("Количество месяцев с продажами выше среднего " + countMonthUp);
    }
}
