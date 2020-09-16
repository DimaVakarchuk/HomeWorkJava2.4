package ru.netology.stats;

public class StatsService {
    public int calculateTotal(int[] totalSale) {
        int sum = 0;
        for (int sale : totalSale) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSales(int[] totalSales) {
        int sum = calculateTotal(totalSales);
        int amount = sum / totalSales.length;
        return amount;
    }

    public int calculatePickSales(int[] totalSales) {
        int profitMax = totalSales[0];
        int indexMax = 0;
        for (int month = 0; month < totalSales.length; month++) {
            int sale = totalSales[month];
            if (profitMax <= sale) {
                profitMax = sale;
                indexMax = month;
            }
        }
        return indexMax;
    }

    public int calculateMinimumSales(int[] totalSales) {
        int profitMin = totalSales[0];
        int indexMin = 0;
        for (int month = 0; month < totalSales.length; month++) {
            int sale = totalSales[month];
            if (profitMin >= sale) {
                profitMin = sale;
                indexMin = month;
            }
        }
        return indexMin;
    }

    public int calculatePopulationIsBelowAverage(int[] totalSales) {
        int index = 0;
        int amount = calculateAverageSales(totalSales);
        for (int month = 0; month < totalSales.length; month++) {
            if (totalSales[month] < amount)
                index++;
        }
        return index;
    }

    public int calculateAboveAverageSales(int[] totalSales) {
        int index = 0;
        int amount = calculateAverageSales(totalSales);
        for (int month = 0; month < totalSales.length; month++) {
            if (totalSales[month] > amount)
                index++;
        }
        return index;
    }
}

