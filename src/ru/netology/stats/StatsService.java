package ru.netology.stats;

public class StatsService {
    public int sum(int[] months) {
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public int middleSum(int[] months) {

        return sum(months) / months.length;
    }

    public int hiMonth(int[] months) {
        int max = months[0];
        int count = 0;
        int month = 0;
        for (int m : months) {
            count++;
            if (max <= m) {
                month = count;
                max = m;
            }
        }
        return month;

    }

    public int lowMonth(int[] months) {
        int min = months[0];
        int count = 0;
        int month = 0;
        for (int m : months) {
            count++;
            if (min >= m) {
                month = count;
                min = m;
            }
        }
        return month;

    }

    public int lowerMiddle(int[] months) {
        int count = 0;
        for (int month : months) {
            if (month < middleSum(months)) count++;
        }
        return count;
    }

    public int higherMiddle(int[] months) {
        int count =0;
        for (int month : months) {
            if (month > middleSum(months)) count++;
        }
        return count;
    }
}