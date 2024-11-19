package ru.netology.Task1Auto;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest{

    @Test
    void calculateCashbackNGPositive() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 700;

        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);

    }

    @Test
    void calculateCashbackNGNegative() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
}

