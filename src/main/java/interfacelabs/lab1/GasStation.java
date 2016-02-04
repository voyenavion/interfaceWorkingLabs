package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class GasStation extends Station implements FuelStation {


    public int dispenseFuel(Car car){

        while(!isItFull(car)){
            car.refuel();
            car.addFuel(makeNozzle2());


        }
        car.closeGasCap();
        System.out.println("your new fuel level is " + car.checkFuel());
        return car.checkFuel();
    }

    public boolean isItFull(Car car){
        boolean isItFull = car.checkFuel() == car.getCapacity();
        return isItFull;
    }



    private Nozzle2 makeNozzle2() {
        return new Nozzle2();
    }

    public class Nozzle2 {

    }





}

