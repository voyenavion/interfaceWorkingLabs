package interfaceLabs.lab1;

import interfacelabs.lab1.Charger;
import interfacelabs.lab1.GasStation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/3/16.
 */
public class GasStationTest {

    GasStation gasStation;
    Charger charger;
    @Before
    public void init(){
        gasStation = new GasStation();
        charger = new Charger();
    }

    @Test
    public void testDispenseFuel() throws Exception {

        assertEquals(500, gasStation.dispenseFuel(charger) );
    }

    @Test
    public void testIsItFull() throws Exception {

    }
}