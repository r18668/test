package main;

/**
 * Created by 1 on 07.01.2017.
 */
public class CarImpl implements Car {
    int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void go(){
        System.out.println("Go at speed " + speed);
    }
}
