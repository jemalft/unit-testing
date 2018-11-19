package moneyOrder;

public class PosTerminal {

    private static final String SHOP_ACCOUNT_NUMBER = "00000000-00000000";
    private final ReceiptPrinter receiptPrinter;
    private final BankConnection bankConnection;

    public PosTerminal(BankConnection bankConnection,
                       ReceiptPrinter receiptPrinter) {
        this.bankConnection = bankConnection;
        this.receiptPrinter = receiptPrinter;
    }

    public boolean buyWithCard(int amountOfMoney, String cardNumber) {

        return false;
    }
}