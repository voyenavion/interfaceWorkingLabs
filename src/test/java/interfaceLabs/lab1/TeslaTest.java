package interfaceLabs.lab1;

import interfacelabs.lab1.PowerStation;
import interfacelabs.lab1.Tesla;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/3/16.
 */
public class TeslaTest {

    Tesla tesla;
    PowerStation powerStation;
    @Before
    public void init(){
        tesla = new Tesla();
        powerStation = new PowerStation();
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
    public void testCheckFuel() throws Exception {
        powerStation.dispenseFuel(tesla);

        tesla.drive(10);
        assertEquals(190, tesla.checkFuel());
    }

    @Test
    public void testAddFuel() throws Exception {

    }
}