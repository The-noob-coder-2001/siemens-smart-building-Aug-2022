import java.util.Scanner;

public class CurrentAccount extends Account {
    private double penaltlyAmountForCurrentAccount;
    private double minimumBalanceForCurrentAccount;

    public CurrentAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            DebitCard accountDebitCard, double penaltlyAmountForCurrentAccount,
            double minimumBalanceForCurrentAccount) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode, accountDebitCard);
        this.penaltlyAmountForCurrentAccount = penaltlyAmountForCurrentAccount;
        this.minimumBalanceForCurrentAccount = minimumBalanceForCurrentAccount;
    }

    public CurrentAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            double penaltlyAmountForCurrentAccount, double minimumBalanceForCurrentAccount) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode);
        this.penaltlyAmountForCurrentAccount = penaltlyAmountForCurrentAccount;
        this.minimumBalanceForCurrentAccount = minimumBalanceForCurrentAccount;
    }

    @Override
    public float checkBalance() throws InvalidPinException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your debit card PIN");
        int pin = sc.nextInt();
        if (pin == this.getAccountDebitCard().getDebitCardPin()) {
            return this.getAccountBalance();
        } else {
            throw new InvalidPinException("Invalid Pin");
        }

    }

}
