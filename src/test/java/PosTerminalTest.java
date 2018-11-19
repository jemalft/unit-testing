import moneyOrder.BankConnection;
import moneyOrder.ReceiptPrinter;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;

public class PosTerminalTest {
    @Test
    public void shouldPrintSuccessfulWithdrawal() {
        BankConnection bankConnection = mock(BankConnection.class);
        ReceiptPrinter receiptPrinter = mock(ReceiptPrinter.class);
        // the test case continues...
    }
}