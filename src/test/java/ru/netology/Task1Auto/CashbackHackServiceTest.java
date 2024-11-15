package ru.netology.Task1Auto;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest{

    @Test
    void calculateCashbackPositive() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 700;

        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(actual,expected);

    }

    @Test
        void calculateCashbackNegative() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }
}

