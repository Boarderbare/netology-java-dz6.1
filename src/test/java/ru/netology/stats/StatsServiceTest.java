package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    long sales[] = {5, 15, 10, 4, 16, 40, 13, 17, 6, 14, 30, 45};
    StatsService service = new StatsService();

    @Test
    public void shouldCalcSum() {
        long expectedTotalSum = 215;
        int actualSumTotalSales = (int) service.sumTotalSales(sales);
        assertEquals(expectedTotalSum, actualSumTotalSales);
    }

    @Test
    public void shouldCalcAvgSumPerMonth() {
        int expectedAvgSumPerMonth = 18;
        long actualAvgSumPerMonth = service.avgSalesPerMonth(sales);
        assertEquals(expectedAvgSumPerMonth, actualAvgSumPerMonth);
    }

    @Test
    public void shouldCalcCountHighMonth() {
        int expectedHighMonth = 12;
        int actualMonthHighSales = service.monthHighSales(sales);
        assertEquals(expectedHighMonth, actualMonthHighSales);
    }

    @Test
    public void shouldCalcCountLowMonth() {
        int expectedLowMonth = 4;
        int actualMonthLowSales = service.monthLowSales(sales);
        assertEquals(expectedLowMonth, actualMonthLowSales);
    }

    @Test
    public void shouldCalcCountMonthLowAvg() {
        long expectedCountLowAvg = 9;
        int actualMonthLowSalesAvg = service.countMonthLowSalesAvg(sales);
        assertEquals(expectedCountLowAvg, actualMonthLowSalesAvg);
    }

    @Test
    public void shouldCalcCountMonthUpAvg() {
        long expectedCountUpAvg = 3;
        int actualMonthUpSales = service.countMonthUpSalesAvg(sales);
        assertEquals(expectedCountUpAvg, actualMonthUpSales);
    }
}