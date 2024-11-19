package ru.netology.Task1Auto;

//import org.testng.annotations.Test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest{

    @Test
    void calculateCashbackTestNGPositive() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 700;

        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);

    }

    @Test
    void calculateCashbackTestNGNegative() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
}

