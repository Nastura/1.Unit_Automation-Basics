package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {
    @Test

    public void cashbackАmountCalculationTheAmountIs1000() {
        // Сумма покупки равна 1000

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void cashbackАmountCalculationAmountMoreThan1000() {
        // Сумма покупки больше 1000

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);

    }

    @Test
    void CashbackАmountCalculationAmountLessThan1000() {
        // Сумма покупки меньше 1000

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

}