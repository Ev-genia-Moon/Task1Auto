package re.netology.Task1Auto;

import org.junit.jupiter.api.Test;
import ru.netology.Task1Auto.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CachbackHackServiceUnit4Test {

    @Test
    void calculateCashback4Positive() {
        CashbackHackService cashback4 = new CashbackHackService();
        int amount = 700;

        int actual = cashback4.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);

    }

    @Test
    void calculateCashback4Negative() {
        CashbackHackService cashback4 = new CashbackHackService();
        int amount = 1000;

        int actual = cashback4.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);

    }

}
