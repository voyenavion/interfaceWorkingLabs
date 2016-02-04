package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class PowerStation implements FuelStation {

    public int dispenseFuel(Car car){

        while(!isItFull(car)){
            car.refuel();
            car.addFuel(makeNozzle());


        }
        System.out.println("your new fuel level is " + car.checkFuel());
        return car.checkFuel();
    }

    public boolean isItFull(Car car){
        boolean isItFull = car.getCapacity() == car.checkFuel();
        return isItFull;
    }

    private Nozzle makeNozzle() {
        return new Nozzle();
    }

    public class Nozzle{

    }


}
