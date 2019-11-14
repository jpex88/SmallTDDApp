import java.util.List;

public class UserController {
    private final IUserService iUserService;
    private final IPokemonService iPokemonService;

    public UserController(IUserService iUserService, IPokemonService iPokemonService) {
        this.iUserService = iUserService;
        this.iPokemonService = iPokemonService;
    }

    public User getMe(int i) {
        User user = iUserService.getById(i);
        return user;
    }

    public List<Pokemon> getUsersPokemons(int i) {
        User user = iUserService.getById(i);
        List<Pokemon> pokemons = iPokemonService.getByUser(user);
        return null;
    }
}

