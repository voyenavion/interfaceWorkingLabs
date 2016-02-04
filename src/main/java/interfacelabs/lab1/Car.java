package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public abstract class Car implements Driveable {
    private int fuel;
    private boolean on = false;
    private int capacity;
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

    public int checkFuel() {
        return fuel;
    }

    public void drive(int miles) {
    }

    public void addFuel(PowerStation.Nozzle nozzle){
        fuel++;

    }

    public void addFuel(GasStation.Nozzle2 nozzle2){
        fuel++;

    }

    public void minusFuel(){
        fuel--;
    }
}
