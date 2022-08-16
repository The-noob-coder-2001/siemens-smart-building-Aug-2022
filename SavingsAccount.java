public class SavingsAccount extends Account implements InterestEligibleAccounts{
    private int savingsAccountMinBalance;

    private AccountGrade savingsAccountsGrade;

    
    public SavingsAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode,int savingsAccountMinBalance, AccountGrade savingsAccountsGrade) {
        super(accountHolderName, accountBalance, accountNumber, accountIfscCode);
        this.savingsAccountMinBalance = savingsAccountMinBalance;
        this.savingsAccountsGrade = savingsAccountsGrade;
    }



    public SavingsAccount(String accountHolderName, float accountBalance, String accountNumber, String accountIfscCode, DebitCard accountDebitCard,int savingsAccountMinBalance, AccountGrade savingsAccountsGrade) {
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
    public float checkBalance() {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public float calculateInterest() {
        // TODO Auto-generated method stub
        return 0;
    }

    


}
