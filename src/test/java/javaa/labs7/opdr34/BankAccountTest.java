package javaa.labs7.opdr34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount(5);
        bankAccount.setBalance(BigDecimal.valueOf(100));
    }

    @Test
    void getInterestRate() {
        //Given


        //When
        int actual = bankAccount.getAccountNumber();

        //Then
        assertEquals(5, actual);
    }

    @Test
    void getInterestRate2() {
        //Given


        //When
        BigDecimal actual = bankAccount.getBalance();

        //Then
        assertEquals(BigDecimal.valueOf(100), actual);
    }
}