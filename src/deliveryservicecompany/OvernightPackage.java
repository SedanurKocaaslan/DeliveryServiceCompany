package deliveryservicecompany;

public class OvernightPackage extends Package {
    public double additionalFee;

    public OvernightPackage(double additionalFee, String nameRecipient, String addressRecipient, String cityRecipient, String stateRecipient, String zipCodeRecipient, String nameSender, String addressSender, String citySender, String stateSender, String zipCodeSender, double weight, double costPerOunce) {
        super(nameRecipient, addressRecipient, cityRecipient, stateRecipient, zipCodeRecipient, nameSender, addressSender, citySender, stateSender, zipCodeSender, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (weight * additionalFee);
    }
}