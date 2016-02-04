package interfacelabs.lab1;

/**
 * Created by shaungould on 2/2/16.
 */
public class GasCar extends Car {
    private int fuel = 0;
    private int oZPerMile = 3;
    public int getOZPerMile(){
        return oZPerMile;
    }

    public void drive(int miles){
        turnOn();
        if (checkOn()){
            int i;
            for(i = 0; i < miles; i++){
                if (checkFuel()>0){
                    minusFuel();
                    System.out.println(i + "miles");
                } else {
                    turnOff();
                    System.out.println("ran out of fuel at mile " + i + "!");
                    break;
                }
            }

            System.out.println("you drove " + i + " miles, and your fuel is at " + checkFuel());


        } else {
            System.out.println("turn the car on first!");
        }


    }

    public void minusFuel(){
        fuel -= oZPerMile;
    }

}
