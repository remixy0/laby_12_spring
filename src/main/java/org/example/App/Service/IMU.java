package org.example.App.Service;

import java.util.ArrayList;
import java.util.List;

public class IMU implements Sensor{
    Effort effort;
    private List<Double> acceleration;
    private double period;

    public IMU(Effort effort) {
        this.effort = effort;
        acceleration = effort.getData();
        period = 1/ effort.getDataRate();
    }

    @Override
    public double averageSpeed() {
        double sum = calculateSpeed().stream().mapToDouble(Double::doubleValue).sum();
        return sum/calculateSpeed().size();
    }

    @Override
    public double averageAcceleration() {
        double sum = acceleration.stream().mapToDouble(Double::doubleValue).sum();
        return sum/acceleration.size();
    }

    @Override
    public double timeOfMovement() {
        return (finishIndex() - startIndex())*period;
    }

    @Override
    public String toString() {
        return effort.getAthleteName() + " " + effort.getAthleteSurname() + "  sensor type: "+  effort.getSensorType() + "     data:" + effort.getData();
    }


    private int startIndex(){
        for(int i=0; i<calculateSpeed().size(); i++){
            if(calculateSpeed().get(i) > 1) return i;
        }
        return -1;
    }

    private int finishIndex(){
        for(int i=startIndex(); i<calculateSpeed().size(); i++){
            if(calculateSpeed().get(i) < 0.1) return i;
        }
        return -1;
    }

    private List<Double> calculateSpeed() {
        List<Double> speed = new ArrayList<>();
        double actualSpeed = 0;
        for(Double d : acceleration){
            actualSpeed += d * period;
            speed.add(actualSpeed);
        }
        return speed;
    }
}
