package interfaceLabs.lab1;

import interfacelabs.lab1.Corolla;
import interfacelabs.lab1.GasStation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/2/16.
 */
public class CorollaTest {
    Corolla corolla;
    GasStation gasStation;
    @Before
    public void initialize(){
        gasStation = new GasStation();
        corolla = new Corolla();
    }

    @Test
    public void drive(){
        gasStation.dispenseFuel(corolla);
        corolla.drive(10);
        System.out.println(corolla.checkFuel());
    }

    @Test
    public void checkFuelTest(){

        assertEquals(400, corolla.checkFuel());
    }



}