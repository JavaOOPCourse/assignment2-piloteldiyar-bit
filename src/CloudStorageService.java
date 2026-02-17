public class CloudStorageService extends Service implements PremiumFeature, Billable {

    public CloudStorageService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (isActivated()) {
            System.out.println(getServiceName() + " is syncing files to cloud storage...");
        } else {
            System.out.println("Service " + getServiceName() + " is inactive. Please activate first.");
        }
    }

    @Override
    public void upgradeToPremium() {
        System.out.println(getServiceName() + " upgraded to Premium: Storage capacity increased to 1TB!");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating monthly bill for " + getServiceName() + ": $9.99");
    }
}
