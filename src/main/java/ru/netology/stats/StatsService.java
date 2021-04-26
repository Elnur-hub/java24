package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long calculateAverageSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            long monthlyAverageSum = calculateSum(sales) / sales.length;
            sum = monthlyAverageSum;
        }

        return sum;
    }


    public long monthWithPeakSum(long[] sales) {
        long month = 0;
        long peakMonth = 0;
        long maxPeakMonth = sales[0];

        for (long sale : sales) {
            month += 1;
            if (maxPeakMonth <= sale) {
                maxPeakMonth = sale;
                peakMonth = month;
            }
        }
        return peakMonth;
    }


    public long monthWithMinimumSales(long[] sales) {
        long month = 0;
        long minMonth = 0;
        long minSalesMonth = sales[0];

        for (long sale : sales) {
            month += 1;
            if (minSalesMonth >= sale) {
                minSalesMonth = sale;
                minMonth = month;

            }
        }
        return minMonth;
    }


    public long monthBelowAverageSales(long[] sales) {
        long month = 0;
        long mediumSum = calculateAverageSum(sales);
        for (long sale : sales) {
            if (mediumSum < sale) {
                month += 1;
            }
        }
        return month;

    }


    public long monthOverAverageSales(long[] sales) {
        long month = 0;
        long mediumSum = calculateAverageSum(sales);
        for (long sale : sales) {
            if (mediumSum > sale) {
                month += 1;
            }
        }
        return month;

    }

}








