package ru.netology.services;

public class MonthVacation {

    public int calcMonthVacation(int income, int expenses, int threshhold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshhold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
