package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void summary() {
        assertEquals(180, service.summary(sales));
    }

    @Test
    void averageCost() {
        assertEquals(15, service.averageCost(sales));
    }

    @Test
    void maxMonth() {
        assertEquals(8, service.maxMonth(sales));
    }

    @Test
    void minMonth() {
        assertEquals(9, service.minMonth(sales));
    }

    @Test
    void lowerMonths() {
        assertEquals(5, service.lowerMonths(sales));
    }

    @Test
    void higherMonths() {
        assertEquals(5, service.higherMonths(sales));
    }
}













