
package deliveryservicecompany;

public class DeliveryServiceCompany {
    public static void main(String[] args) {

        System.out.println("== PACKAGE DELIVERY SYSTEM TEST==");

        Package A = new Package("seda", "Yeni doğan mah.", "Kayseri", "Talas", "TR 38238", "nisa", "15 temmuz cad.", "Ankara", "Kızılay", "TR3 80545", 20.0, 6.0);
        System.out.println("[Standart package]");
        System.out.println("Sender: " + A.nameSender + " , " + A.addressSender + " ," + A.citySender + " , " + A.stateSender + " , " + A.zipCodeSender);
        System.out.println("Recipient:" + A.nameRecipient + " , " + A.addressRecipient + " ," + A.cityRecipient + " ," + A. stateRecipient + " ," + A.zipCodeRecipient);
        System.out.println("Weight:" + A.weight + " | Cost per ounce : " + A.costPerOunce);
        System.out.println("Total Shipping Cost : " + A.calculateCost());
        System.out.println("");

        System.out.println("[Two Days Package]");
        TwoDayPackage S = new TwoDayPackage(5.00, "Beyza", "yavuz selim mah.", "Malatya", "Yeşilyurt", "TR 44380", "Sila", "metehan sok.", "İstanbul", "Üsküdar", "TR 34580", 15.0, 3.0);
        System.out.println("Two Days Package ");
        System.out.println("Sender: " + S.nameSender + " , " + S.addressSender + " ," + S.citySender + " , " + S.stateSender + " , " + S.zipCodeSender);
        System.out.println("Recipient:" + S.nameRecipient + " , " + S.addressRecipient + " ," + S.cityRecipient + " ," + S.stateRecipient + " ," + S.zipCodeRecipient);
        System.out.println("Weight:" + S.weight + " | Cost per ounce : " + S.costPerOunce);
        System.out.println("Flat Fee:" + S.flatFee);
        System.out.println("Total Shipping Cost : " + S.calculateCost());
        System.out.println("");

        System.out.println("[Over Night Package]");
        OvernightPackage D = new OvernightPackage(5.00, "Buse", "kitapçı sok.", "Malatya", "Battalgazi", "TR 44300", "Sude", "beydağı sok.", "İzmir", "Buca", "TR 35880", 55.0, 4.0);
        System.out.println("Two Days Package ");
        System.out.println("Sender: " + D.nameSender + " , " + D.addressSender + " ," + D.citySender + " , " + D.stateSender + " , " + D.zipCodeSender);
        System.out.println("Recipient:" + D.nameRecipient + " , " + D.addressRecipient + " ," + D.cityRecipient + " ," + D.stateRecipient + " ," + D.zipCodeRecipient);
        System.out.println("Weight:" + D.weight + " | Cost per ounce : " + D.costPerOunce);
        System.out.println("Flat Fee:" + D.additionalFee);
        System.out.println("Total Shipping Cost : " + D.calculateCost());
        System.out.println("");

    }
}
        
        
        
        
        
        
        
        
        

