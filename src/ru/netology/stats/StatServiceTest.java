package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatServiceTest {
    @Test
    void sum() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = stat.sum(months);

        assertEquals(expected, actual);
    }

    @Test
    void middleSum() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = stat.middleSum(months);

        assertEquals(expected, actual);
    }

    @Test
    void hiMonth() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = stat.hiMonth(months);

        assertEquals(expected, actual);
    }

    @Test
    void lowMonth() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = stat.lowMonth(months);

        assertEquals(expected, actual);
    }

    @Test
    void lowerMiddle() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = stat.lowerMiddle(months);

        assertEquals(expected, actual);
    }

    @Test
    void higherMiddle() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = stat.higherMiddle(months);

        assertEquals(expected, actual);
    }
}