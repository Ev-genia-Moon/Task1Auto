package ru.netology.Task1Auto;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceNGTest {
    @Test
    void CashbackHackServiceNGPositive(){
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    void CashbackHackServiceNGNegative(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}

