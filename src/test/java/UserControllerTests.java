import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class UserControllerTests {

    private UserController instanceToTest;
    private IUserService iUserService;
    private IPokemonService iPokemonService;

    @Before
    public void setUp() {
        this.iPokemonService = mock(IPokemonService.class);
        this.iUserService = mock(IUserService.class);
        this.instanceToTest = new UserController(iUserService, iPokemonService);
    }

    @Test
    public void shouldCallUserServiceWithAnyInt() {

        // Act
        instanceToTest.getMe(15); // den röda lampan i IntelliJ borde kunna fixa det här

        // Assert
        verify(iUserService, times(1)).getById(anyInt());
    }

    @Test
    public void shouldCallTheUserServiceWithGivenID() {

        // Act
        instanceToTest.getMe(15); // den röda lampan i IntelliJ borde kunna fixa det här

        // Assert
        verify(iUserService, times(1)).getById(15);
    }

    @Test
    public void shouldReturnUserByGivenID() {
        // Arrange
        User expectedUser = new User();
        expectedUser.setName("Te");
        when(iUserService.getById(anyInt())).thenReturn(expectedUser);

        // Act
        User actualUser = instanceToTest.getMe(15); // den röda lampan i IntelliJ borde kunna fixa det här

        // Assert
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void shouldFetchUserByGivenUserId() {

        // Act
        instanceToTest.getUsersPokemons(15);

        // Assert
        verify(iUserService, times(1)).getById(anyInt());

    }
    @Test
    public void shouldFetchAUsersPokemonsByUser() {
        // Arrange

        User expectedUser = new User();
        expectedUser.setName("Te");
        when(iUserService.getById(anyInt())).thenReturn(expectedUser);

        // Act
        instanceToTest.getUsersPokemons(15);

        // Assert
        verify(iPokemonService, times(1)).getByUser(expectedUser);
    }


}
