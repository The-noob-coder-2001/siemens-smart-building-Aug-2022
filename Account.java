/**
 * Account
 */
public abstract class Account implements AccountFunctionalities {

    private String accountHolderName;
    private float accountBalance;
    private String accountNumber;
    private String accountIfscCode;
    // every account HAS A debit card

    private DebitCard accountDebitCard;

    protected Account(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,
            DebitCard accountDebitCard) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountIfscCode = accountIfscCode;
        this.accountDebitCard = accountDebitCard;
    }

    protected Account(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;

        this.accountIfscCode = accountIfscCode;
    }

    public void setAccountDebitCard(DebitCard accountDebitCard) {
        this.accountDebitCard = accountDebitCard;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public float getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountIfscCode() {
        return this.accountIfscCode;
    }

    public DebitCard getAccountDebitCard() {
        return this.accountDebitCard;
    }

    // 1) Everytime a new account gets created, a new debit card object should get
    // created AT THE SAME TIME AND GET ATTACHED TO THE ACCOUNT
    // [ tight coupling]

    // 2) Create an account but attach a debit card separately at a later point in
    // the code execution
    // use a setter to set accountDebitCard

    /**
     * What is the abstract functionality:
     * checkBalance()
     */

}