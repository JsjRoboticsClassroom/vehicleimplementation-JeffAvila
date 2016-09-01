package nyc.c4q.jeffavila;

/**
 * Created by c4q on 8/31/16.
 */
public class AstonMartin implements Vehicle {

    private int speed;

    public AstonMartin(int initialSpeed) {
        this.speed = initialSpeed;
    }

    public void applyBrakes(){
        speed = speed - 5;

    }

    public void speedUp(int delta){


    }

    public void slowDown(int delta){

    }
    public int getSpeed() {
        return speed;
    }

}
