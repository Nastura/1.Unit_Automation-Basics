package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {

    @Test

    void cashbackAmountCalculation() {

        CashBackHacker service = new CashBackHacker();
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);
        System.out.println("Для получения кэшбэка, докупите на сумму" + service.remain(amount));
        Assertions.assertEquals(expected, actual);


    }
}