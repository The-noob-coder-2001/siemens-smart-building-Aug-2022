public class Main {
    public static void main(String[] args) throws Exception {

        DebitCard dc1 = new DebitCard(111, "01/28", 203, "78786576 6867867");
        SalaryAccount sa1 = new SalaryAccount("Harshit", 5000, "AX111987",
         "AXAB001", dc1, 50000);

         
        //  System.out.println(     "Interest amount: " + sa1.calculateInterest()        );
         

        System.out.println("Balance amount: " +         sa1.checkBalance()        );
    }    
}
