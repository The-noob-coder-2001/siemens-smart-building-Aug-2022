public class Main {
    public static void main(String[] args) throws Exception {

        // creating object for a new DebitCard:
        DebitCard debitCard1 = new DebitCard(1656, "12/22", 1335, "151246452354");
        // so we have our new debit card successfully created!

        /*
         * let's suppose User has created all sort of accounts: Savings, Salary, Current
         * and the above debitcard belong to the customer.
         */

        // for saving account: interest rate : 5%
        SavingsAccount savings1 = new SavingsAccount("Gouranga Bhattacherjee",
                120000, "151246452354", "12fcsdd",
                debitCard1, 5000, AccountGrade.REGULAR);

        System.out.println("Account Balance for SAVINGS Account" + savings1.checkBalance());
        System.out.println("Interest on your available balance for SAVINGS account: " + savings1.calculateInterest());

        // for current account: interest rate : 0%
        CurrentAccount currentAccount1 = new CurrentAccount("Gouranga Bhattacherjee", 120000, "151246452354", "12fcsdd",
                debitCard1, 2000, 5000);
        System.out.println("Account Balance for CURRENT Account: " + currentAccount1.checkBalance());

        // for salary account: interest rate : 3%
        SalaryAccount salary1 = new SalaryAccount("Gouranga Bhattacherjee",
                120000, "151246452354", "12fcsdd",
                debitCard1, 2000);

        System.out.println("Account Balance for SALARY Account" + salary1.checkBalance());
        System.out.println("Interest on your available balance for SALARY account: " + salary1.calculateInterest());

    }

}
