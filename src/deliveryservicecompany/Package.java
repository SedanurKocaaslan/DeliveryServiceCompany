

    
    package deliveryservicecompany;

public class Package {

    public String nameRecipient;
    public String addressRecipient;
    public String cityRecipient;
    public String stateRecipient;
    public String zipCodeRecipient;
    public String nameSender;
    public String addressSender;
    public String citySender;
    public String stateSender;
    public String zipCodeSender;
    public double weight;
    public double costPerOunce;

    public Package(String nameRecipient, String addressRecipient, String cityRecipient, String stateRecipient, String zipCodeRecipient, String nameSender, String addressSender, String citySender, String stateSender, String zipCodeSender, double weight, double costPerOunce) {
        this.nameRecipient = nameRecipient;
        this.addressRecipient = addressRecipient;
        this.cityRecipient = cityRecipient;
        this.stateRecipient = stateRecipient;
        this.zipCodeRecipient = zipCodeRecipient;
        this.nameSender = nameSender;
        this.addressSender = addressSender;
        this.citySender = citySender;
        this.stateSender = stateSender;
        this.zipCodeSender = zipCodeSender;
        this.weight = weight;
        this.costPerOunce = costPerOunce;

        if (weight < 0) {
            System.out.println("weight cant't be negative ");
        }

        if (costPerOunce < 0) {
            System.out.println("costPerOunce cant't be negative ");
        }
    }

    public double calculateCost() {
        return (weight * costPerOunce);
    }
}
    
    
    
    
    
    
    
    
    
    

