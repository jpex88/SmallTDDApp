import java.util.List;

public interface IPokemonService {
    List<Pokemon> getByUser(User user);

    Pokemon purchasePokemonToUser(User user);
}
