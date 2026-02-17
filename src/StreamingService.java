public class StreamingService extends Service implements PremiumFeature {

    public StreamingService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (isActivated()) {
            System.out.println(getServiceName() + " is streaming 1080p video content...");
        } else {
            System.out.println("Service " + getServiceName() + " is inactive. Please activate first.");
        }
    }

    @Override
    public void upgradeToPremium() {
        System.out.println(getServiceName() + " upgraded to Premium: 4K HDR streaming unlocked!");
    }
}
