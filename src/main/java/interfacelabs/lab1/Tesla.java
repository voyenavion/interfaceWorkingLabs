package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class Tesla extends GreenCar {
    private int amps = 0;

    public final int capacity = 200;
    private boolean on = false;
    private boolean gasCap = true;



    public boolean checkOn(){
        return on;
    }
    public int getCapacity(){return capacity;}



    public boolean turnOn(){
        if(checkOn()){

        } else {
            on = true;
        }
        return on;}
    public boolean turnOff(){
        if(checkOn()){
            on = false;
        }

        return on;
    }

    public void openGasCap(){
        gasCap = false;
    }
    public void closeGasCap(){
        gasCap = true;
    }

    public void refuel() {
        openGasCap();
        turnOff();
    }
    public int checkFuel(){return amps;}

    public void addFuel(PowerStation.Nozzle nozzle){
        amps++;

    }

    public void minusFuel(){
        amps -= ampsPerMile;
    }

}
