package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {

        StatsService serviceAverageSum = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = serviceAverageSum.calculateAverageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithPeakSum() {
        StatsService servicePeakSalesMonth = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = servicePeakSalesMonth.monthWithPeakSum(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monthWithMinimumSales() {
        StatsService serviceMinimumSalesMonth = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = serviceMinimumSalesMonth.monthWithMinimumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthBelowTheAverageSales() {
        StatsService serviceBelowTheAverageSales = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = serviceBelowTheAverageSales.monthBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthOverTheAverageSales() {
        StatsService serviceOverTheAverageSales = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = serviceOverTheAverageSales.monthOverAverageSales(sales);
        assertEquals(expected, actual);
    }
}