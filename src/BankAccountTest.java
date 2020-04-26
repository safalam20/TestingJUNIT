import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount;

    @Before
    public void setUp(){
        bankAccount=new BankAccount("Maya","Tay",1000.0);
        System.out.println("Account is created");
    }

    @Test
    public void deposit_balance() {

        double balance=bankAccount.deposit(200.0,true);
        assertEquals(1200.0,balance,0);

    }
    @Test
    public void deposit_records(){
        bankAccount.deposit(100.0,true);
        bankAccount.deposit(200.0,true);
        bankAccount.deposit(400.0,true);

        Double [] expected={100.0,200.0,400.0};
        Double [] result=new Double[bankAccount.getDepositRecords().size()];
        result=bankAccount.getDepositRecords().toArray(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void withdraw() {
        double balance=bankAccount.withdraw(250.0,true);
        assertEquals(750.0,balance,0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch(){
        bankAccount.withdraw(600.0,false);
    }

    @Test
    public void getBalance_deposit() {
        double balance=bankAccount.deposit(200.0,true);
        assertEquals(1200.0,bankAccount.getBalance(),0);
    }

}