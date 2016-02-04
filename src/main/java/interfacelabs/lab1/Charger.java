package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class Charger extends GasCar {
    private int fuel = 0;
    private boolean on = false;
    private int oZPerMile = 6;


    private int capacity = 100;
    private boolean gasCap = true;

    public boolean checkOn() {
        return on;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean turnOn() {
        if (checkOn()) {

        } else {
            on = true;
        }
        return on;
    }

    public boolean turnOff() {
        if (checkOn()) {
            on = false;
        }

        return on;
    }

    public void openGasCap() {
        gasCap = false;
    }

    public void closeGasCap() {
        gasCap = true;
    }

    public void refuel() {
        openGasCap();
        turnOff();
    }

    public void addFuel(GasStation.Nozzle2 nozzle2){
        fuel++;

    }

    public int checkFuel() {
        return fuel;
    }

    public void minusFuel(){
        if (fuel >= oZPerMile) {
            fuel -= oZPerMile;
        } else {
            fuel = 0;
        }
    }

}


