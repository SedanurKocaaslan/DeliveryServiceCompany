
package deliveryservicecompany;

public class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage(double flatFee, String nameRecipient, String addressRecipient, String cityRecipient, String stateRecipient, String zipCodeRecipient, String nameSender, String addressSender, String citySender, String stateSender, String zipCodeSender, double weight, double costPerOunce) {
        super(nameRecipient, addressRecipient, cityRecipient, stateRecipient, zipCodeRecipient, nameSender, addressSender, citySender, stateSender, zipCodeSender, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}
