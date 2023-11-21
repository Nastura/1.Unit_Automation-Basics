package ru.netology.service;
// boundary - граница
// amountToPurchase - сумма для покупки

public class CashbackHackService {
    private final int boundary = 1000;  // минимальная сумма покупки

    public int remain(int amount) {
        return boundary - amount % boundary; //целочисленное деление, считается остаток
    }
}








