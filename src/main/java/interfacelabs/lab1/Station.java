package interfacelabs.lab1;

/**
 * Created by shaungould on 2/3/16.
 */
public class Station {

    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        Charger charger = new Charger();
        Tesla tesla = new Tesla();
        PowerStation powerStation = new PowerStation();
        GasStation gasStation = new GasStation();

        System.out.println(corolla.checkFuel() + charger.checkFuel() + tesla.checkFuel());


        
        powerStation.dispenseFuel(tesla);
        gasStation.dispenseFuel(charger);
        gasStation.dispenseFuel(corolla);

        System.out.println(corolla.checkFuel() + charger.checkFuel() + tesla.checkFuel());

        corolla.drive(100000000);
        charger.drive(100000000);
        tesla.drive(1000000000);

    }

}