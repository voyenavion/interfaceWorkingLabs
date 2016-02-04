package interfaceLabs.lab1;

import interfacelabs.lab1.PowerStation;
import interfacelabs.lab1.Tesla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/3/16.
 */
public class PowerStationTest {
    PowerStation powerStation;
    Tesla tesla;
    @Before
    public void init(){
        powerStation = new PowerStation();
        tesla = new Tesla();
    }
    @Test
    public void testDispenseFuel() throws Exception {
        assertEquals(800, powerStation.dispenseFuel(tesla));


    }

    @Test
    public void testIsItFull() throws Exception {
        assertEquals(false, powerStation.isItFull(tesla));

    }
}