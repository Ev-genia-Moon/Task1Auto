package ru.netology.Task1Auto;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest{

    @Test
    void calculateCashback() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 700;

        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(actual,expected);

    }
}

