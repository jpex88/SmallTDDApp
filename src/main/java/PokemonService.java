import java.util.List;

public class PokemonService implements IPokemonService {
    private final IUserDb userDb;
    private IExternalPaymentService paymentService;

    public PokemonService(IExternalPaymentService externalPaymentService, IUserDb userDb) {
        this.paymentService = externalPaymentService;
        this.userDb = userDb;
    }

    @Override
    public List<Pokemon> getByUser(User user) {
        return null;
    }

    @Override
    public Pokemon purchasePokemonToUser(User user) {
        paymentService.pay();
        userDb.save(user);
        return null;
    }
}
