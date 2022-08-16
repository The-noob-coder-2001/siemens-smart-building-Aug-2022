import java.util.Scanner;

public class SalaryAccount extends Account implements InterestEligibleAccounts {

    private int salaryAccountDailyWithdrawLimit;

    // account with debit card pre-applied
    public SalaryAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            DebitCard accountDebitCard, int salaryAccountDailyWithdrawLimit) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode, accountDebitCard);
        this.salaryAccountDailyWithdrawLimit = salaryAccountDailyWithdrawLimit;
    }

    // salary accounts with no requirement of debit card
    public SalaryAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            int salaryAccountDailyWithdrawLimit) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode);
        this.salaryAccountDailyWithdrawLimit = salaryAccountDailyWithdrawLimit;
    }

    public int getSalaryAccountDailyWithdrawLimit() {
        return this.salaryAccountDailyWithdrawLimit;
    }

    @Override
    public float checkBalance() throws Exception {

        // create a scanner and accept pin number as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your debit card PIN");
        int pin = sc.nextInt();
        /*
         * Find the attached debit card. From that card object, find the pin.
         * compare and check if PIN is correct!
         * Note: This may throw a NULL POINTER EXCEPTION
         */
        if (pin == this.getAccountDebitCard().getDebitCardPin()) {
            return this.getAccountBalance();
        } else {
            throw new InvalidPinException("Invalid Pin");
        }

    }

    @Override
    public float calculateInterest() throws Exception {
        // interest applicable on current amount for a month
        return 0.03f * this.checkBalance();
    }

}
