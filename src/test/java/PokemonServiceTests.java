import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class PokemonServiceTests {

    private IExternalPaymentService externalPaymentService;
    private IUserDb databaseMock;
    private PokemonService instanceToTest;

    @Before
    public void setUp(){
        this.externalPaymentService = mock(IExternalPaymentService.class);
        this.databaseMock = mock(IUserDb.class);
        this.instanceToTest = new PokemonService(externalPaymentService, databaseMock);
    }

    @Test
    public void shouldReturnAPokemon() {

        // Act
        instanceToTest.purchasePokemonToUser(new User());

        // Assert
        verify(externalPaymentService, times(1)).pay();
    }

    @Test
    public void shouldCallSave() {
        // Arrange
        User expectedUser = new User();

        // Act
        instanceToTest.purchasePokemonToUser(expectedUser);

        // Assert
        verify(databaseMock, times(1)).save(expectedUser);
    }

}
