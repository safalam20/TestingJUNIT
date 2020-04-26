import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }
    @Before
    public void setup() {
        account = new BankAccount("Maya", "Tay", 1000.00);
        System.out.println("Running a test...");
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.0, true, 1325.0},
                {489.0, true, 1489.0},
                {1000.00, true, 2000.00}
        });
    }
    @Test
    public void deposit(){
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0);
    }
}