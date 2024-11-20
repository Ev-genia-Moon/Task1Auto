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

        assertEquals(expected, actual);
    }

    //@Test
}

