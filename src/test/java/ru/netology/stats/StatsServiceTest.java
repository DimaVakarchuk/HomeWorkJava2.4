package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void calculateTotal() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        var actual = service.calculateTotal(totalSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSales() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calculateAverageSales(totalSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculatePickSales() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.calculatePickSales(totalSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinimumSales() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.calculateMinimumSales(totalSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculatePopulationIsBelowAverage() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculatePopulationIsBelowAverage(totalSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverageSales() {
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateAboveAverageSales(totalSales);
        assertEquals(expected, actual);

    }
}