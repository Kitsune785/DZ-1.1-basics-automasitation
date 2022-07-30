package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowHowMuchIsMissingBeforeCashbackMin() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowHowMuchIsMissingBeforeCashbackMax() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowHowMuchIsMissingBeforeCashbackMiddle() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

//    @Test
//    public void shouldNotShowHowMuchIsMissingBeforeCashback() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//        int expected = 0;
//        int actual = cashbackHackService.remain(amount);
//
//        assertEquals(expected, actual);
//    }


}