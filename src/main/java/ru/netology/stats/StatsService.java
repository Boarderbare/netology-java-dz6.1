package ru.netology.stats;

import java.text.DecimalFormat;

public class StatsService {
    // сумма всех продаж
    public long sumTotalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public float avgSalesPerMonth(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        float avgSum = (float) sum / sales.length;
        return avgSum;
    }

    //   Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int monthHighSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int monthLowSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int countMonthLowSalesAvg(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        float avgSum = (float) sum / sales.length;
        int i = 0;
        for (long sale : sales) {
            if (sale <= avgSum) {
                i++;
            }
        }
        return i;
    }

    //        Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int countMonthUpSalesAvg(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        float avgSum = (float) sum / sales.length;
        int i = 0;
        for (long sale : sales) {
            if (sale >= avgSum) {
                i++;
            }
        }
        return i;
    }
}