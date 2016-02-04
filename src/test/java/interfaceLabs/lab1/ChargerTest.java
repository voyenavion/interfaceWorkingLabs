package interfaceLabs.lab1;

import interfacelabs.lab1.Charger;
import interfacelabs.lab1.GasStation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/3/16.
 */
public class ChargerTest {

    Charger charger;
    GasStation gasStation;
    @Before
    public void init(){
        charger = new Charger();
        gasStation = new GasStation();
    }

    @Test
    public void testCheckOn() throws Exception {

    }

    @Test
    public void testGetCapacity() throws Exception {

    }

    @Test
    public void testTurnOn() throws Exception {

    }

    @Test
    public void testTurnOff() throws Exception {

    }

    @Test
    public void testOpenGasCap() throws Exception {

    }

    @Test
    public void testCloseGasCap() throws Exception {

    }

    @Test
    public void testRefuel() throws Exception {

    }

    @Test
    public void testAddFuel() throws Exception {

    }

    @Test
    public void testCheckFuel() throws Exception {

    }

    @Test
    public void testDrive() throws Exception {
        gasStation.dispenseFuel(charger);
        charger.drive(10);
        assertEquals(40, charger.checkFuel());
    }

    @Test
    public void testAddFuel1() throws Exception {

    }
}