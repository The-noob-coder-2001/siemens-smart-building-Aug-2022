import java.util.Scanner;

public class SavingsAccount extends Account implements InterestEligibleAccounts {
    private int savingsAccountMinBalance;

    private AccountGrade savingsAccountsGrade;

    public SavingsAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            int savingsAccountMinBalance, AccountGrade savingsAccountsGrade) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode);
        this.savingsAccountMinBalance = savingsAccountMinBalance;
        this.savingsAccountsGrade = savingsAccountsGrade;
    }

    public SavingsAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            DebitCard accountDebitCard, int savingsAccountMinBalance, AccountGrade savingsAccountsGrade) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode, accountDebitCard);
        this.savingsAccountMinBalance = savingsAccountMinBalance;
        this.savingsAccountsGrade = savingsAccountsGrade;
    }

    public int getSavingsAccountMinBalance() {
        return this.savingsAccountMinBalance;
    }

    public AccountGrade getSavingsAccountsGrade() {
        return this.savingsAccountsGrade;
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

    @Override
    public float calculateInterest() throws InvalidPinException {
        return 0.05f * this.checkBalance();

    }

}
