public abstract class Service {
    protected String serviceName;
    protected int serviceId;
    protected boolean isActivated;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActivated = false;
    }

    public void activateService() {
        if (!isActivated) {
            isActivated = true;
            System.out.println(serviceName + " is now ACTIVATED.");
        } else {
            System.out.println(serviceName + " is already active.");
        }
    }

    public void deactivateService() {
        if (isActivated) {
            isActivated = false;
            System.out.println(serviceName + " has been DEACTIVATED.");
        } else {
            System.out.println(serviceName + " is already inactive.");
        }
    }

    public abstract void performService();

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
