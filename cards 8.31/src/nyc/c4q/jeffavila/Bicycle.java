package nyc.c4q.jeffavila;

/**
 * Created by c4q on 8/31/16.
 */
public class Bicycle implements Vehicle {
    double speed;

    public Bicycle(){
        this.speed = 0.0;
    }

    public void applyBrakes(){
        while (speed > 0.0){
            speed--;
        }


    }

    public void speedUp(int delta){
        while (speed < speed + delta){
            speed++;
        }

    }

    public void slowDown(int delta){
        while (speed > speed - delta){
            speed--;
        }

    }
}
