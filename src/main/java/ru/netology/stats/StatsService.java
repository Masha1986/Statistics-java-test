package ru.netology.stats;

public class StatsService {

    public int summary(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageCost(int[] sales) {
        return summary(sales) / sales.length;
    }
    //средняя сумма продаж в месяц
    private int getLargest(int[] sales) {
        int largest = sales[0];
        for (int sale : sales) {
            if (largest < sale) {
                largest = sale;
            }
        }
        return largest;
    }

    public int maxMonth(int[] sales) {
        //максимальная сумма продажи
        int largest = getLargest(sales);

        int index = 0;
        int lastLargest = 0;
        for (int sale : sales) {
            index++;
            if (sale == largest) {
                lastLargest = index;
            }
        }
        return lastLargest;
    }

    private int getSmallest(int[] sales) {
        int smallest = sales[0];
        for (int sale : sales) {
            if (smallest > sale) {
                smallest = sale;
            }
        }
        return smallest;
    }

    public int minMonth(int[] sales) {
        int smallest = getSmallest(sales);

        int index = 0;
        int lastSmallest = 0;
        for (int sale : sales) {
            index++;
            if (sale == smallest) {
                lastSmallest = index;
            }
        }
        return lastSmallest;
    }

    public int lowerMonths(int[] sales) {
        int averageCost = averageCost(sales);
        int badMonth = 0;
        for (int sale : sales) {
            if (sale < averageCost) {
                badMonth++;
            }
        }
        return badMonth;
    }

    public int higherMonths(int[] sales) {
        int averageCost = averageCost(sales);
        int bestMonth = 0;
        for (int sale : sales) {
            if (sale > averageCost) {
                bestMonth++;
            }
        }
        return bestMonth;
    }
}







