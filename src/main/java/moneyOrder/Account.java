package moneyOrder;
public interface Account {

    boolean withdraw(int amountOfMoney, String destinationAccountNumber);
    boolean enter(int amountOfMoney, String sourceAccountNumber);
    void rollback();
    void commit();
}