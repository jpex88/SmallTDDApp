public class ExternalPaymentService implements IExternalPaymentService {

    public ExternalPaymentService() {
        throw new ExternalServiceConnectionException("Oops! Missing credentials.");
    }

    @Override
    public void pay() {
        throw new ExternalServiceConnectionException("Cannot pay when not connected.");
    }
}
