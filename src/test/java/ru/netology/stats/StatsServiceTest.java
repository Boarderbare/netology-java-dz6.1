package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    long sales[] = {5, 15, 10, 4, 16, 40, 13, 17, 6, 14, 30, 45};
    long expectedTotalSum = 215;
    float expectedAvgSumPerMonth = 17.916666F;
    int expectedHighMonth = 12;
    int expectedLowMonth = 4;
    long expectedCountLowAvg = 9;
    long expectedCountUpAvg = 3;

    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();
        int actualSumTotalSales = (int) service.sumTotalSales(sales);
        assertEquals(expectedTotalSum, actualSumTotalSales);
    }

    @Test
    public void shouldCalcAvgSumPerMonth() {
        StatsService service = new StatsService();
        float actualAvgSumPerMonth = service.avgSalesPerMonth(sales);
        assertEquals(expectedAvgSumPerMonth, actualAvgSumPerMonth);
    }

    @Test
    public void shouldCalcCountHighMonth() {
        StatsService service = new StatsService();
        int actualMonthHighSales = service.monthHighSales(sales);
        assertEquals(expectedHighMonth, actualMonthHighSales);
    }

    @Test
    public void shouldCalcCountLowMonth() {
        StatsService service = new StatsService();
        int actualMonthLowSales = service.monthLowSales(sales);
        assertEquals(expectedLowMonth, actualMonthLowSales);
    }

    @Test
    public void shouldCalcCountMonthLowAvg() {
        StatsService service = new StatsService();
        int actualMonthLowSalesAvg = service.countMonthLowSalesAvg(sales);
        assertEquals(expectedCountLowAvg, actualMonthLowSalesAvg);
    }

    @Test
    public void shouldCalcCountMonthUpAvg() {
        StatsService service = new StatsService();
        int actualMonthUpSales = service.countMonthUpSalesAvg(sales);
        assertEquals(expectedCountUpAvg, actualMonthUpSales);
    }
}