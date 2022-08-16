public class DebitCardPinGenerator extends DebitCard {

    private int newDebitCardNumber;

    public DebitCardPinGenerator(int debitCardPin, String debitCardExpiry, int debitCardCvvNumber,
            String debitCardNumber, int newDebitCardNumber) {
        super(debitCardPin, debitCardExpiry, debitCardCvvNumber, debitCardNumber);
        this.newDebitCardNumber = newDebitCardNumber;
    }

}
