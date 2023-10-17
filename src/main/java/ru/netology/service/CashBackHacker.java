package ru.netology.service;
// boundary - граница
// amountToPurchase - сумма для покупки

public class CashBackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}








