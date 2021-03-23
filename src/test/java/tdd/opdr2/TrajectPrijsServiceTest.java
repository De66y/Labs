/*package tdd.opdr2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TrajectPrijsServiceTest {

    private TrajectPrijsService tps = Mockito.mock(TrajectPrijsService.class);

    @BeforeEach
    public void setUp() {
        tps = new TrajectPrijsService();
        Mockito.when(tps.getTrajectPrijs("Etten-Leur", "Rotterdam-Centraal")).thenReturn(56);
    }

    @Test
    public void getTrajectPrijs() {
        int test = tps.getTrajectPrijs("Etten-Leur", "Rotterdam-Centraal");
        Assertions.assertEquals(56, test);
    }
}*/