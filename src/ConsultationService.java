public class ConsultationService extends Service implements Billable {

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (isActivated()) {
            System.out.println(getServiceName() + " is connecting you to an available consultant...");
        } else {
            System.out.println("Service " + getServiceName() + " is inactive. Please activate first.");
        }
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for " + getServiceName() + ": $50.00/session");
    }
}
