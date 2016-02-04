package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class GreenCar extends Car {
    private int amps;
    public final int ampsPerMile = 1;
    public int getAmps(){return amps;}



    public void drive(int miles){
        turnOn();
        if (checkOn()){
            int i;
            for( i = 0; i < miles; i++){
                if (checkFuel()>0){
                    minusFuel();
                    System.out.println(i + "miles");
                } else {
                    turnOff();
                    System.out.println("ran out of electricity at mile " + i + "!");

                    break;
                }
            }

            System.out.println("you drove " + i + " miles, and your amps are at " + checkFuel());

        } else {
            System.out.println("turn the car on first!");



        }


    }

    public void minusFuel(){
        amps -= ampsPerMile;
    }
}
