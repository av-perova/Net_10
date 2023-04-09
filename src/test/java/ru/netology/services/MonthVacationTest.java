package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthVacationTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    void MonthVacationTest(int income, int expenses, int threshold, int expected) {
        MonthVacation service = new MonthVacation();
        int actual = service.calcMonthVacation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
