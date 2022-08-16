public class DebitCard {

    private int debitCardPin;
    private String debitCardExpiry; // come back to this!!!
    private int debitCardCvvNumber;
    private String debitCardNumber;

    public DebitCard(int debitCardPin, String debitCardExpiry, int debitCardCvvNumber, String debitCardNumber) {
        this.debitCardPin = debitCardPin;
        this.debitCardExpiry = debitCardExpiry;
        this.debitCardCvvNumber = debitCardCvvNumber;
        this.debitCardNumber = debitCardNumber;
    }

    public DebitCard(String debitCardExpiry, int debitCardCvvNumber, String debitCardNumber) {

        this.debitCardExpiry = debitCardExpiry;
        this.debitCardCvvNumber = debitCardCvvNumber;
        this.debitCardNumber = debitCardNumber;
    }

    public int getDebitCardPin() {
        return this.debitCardPin;
    }

    public void setDebitCardPin(int debitCardPin) {
        this.debitCardPin = debitCardPin;
    }

    public String getDebitCardExpiry() {
        return this.debitCardExpiry;
    }

    public int getDebitCardCvvNumber() {
        return this.debitCardCvvNumber;
    }

    public String getDebitCardNumber() {
        return this.debitCardNumber;
    }

}
