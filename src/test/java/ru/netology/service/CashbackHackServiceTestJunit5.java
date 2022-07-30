package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJunit5 {

    @Test
     public void shouldShowHowMuchIsMissingBeforeCashbackMin() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 999;
            int expected = 1;
            int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowHowMuchIsMissingBeforeCashbackMax() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowHowMuchIsMissingBeforeCashbackMiddle() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}