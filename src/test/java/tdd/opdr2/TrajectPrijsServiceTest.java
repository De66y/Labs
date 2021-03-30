package tdd.opdr2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @Mock
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService;

    @Mock
    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenhedenService;

    @InjectMocks //object aanmaken, stopt alle mocks erin @Mock
    private TrajectPrijsService tps;

    @BeforeEach
    public void setUp(){
    }

    @Test
    public void getTrajectPrijs() {
        //Given
        Mockito.when(trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(4)).thenReturn(10);
        Mockito.when(trajectNaarTrajectEenhedenService.getTrajectEenheden("Etten-Leur", "Rotterdam-Centraal")).thenReturn(4);

        //When
        int test = tps.getTrajectPrijs("Etten-Leur", "Rotterdam-Centraal");

        Assertions.assertEquals(40, test);
    }
}