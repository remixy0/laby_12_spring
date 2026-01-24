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
        return 0;
    }

    @Override
    public double averageAcceleration() {
        return 0;
    }

    @Override
    public double timeOfMovement() {
        return 0;
    }

    @Override
    public String toString() {
        return effort.getAthleteName() + " " + effort.getAthleteSurname() + "  sensor type: "+  effort.getSensorType() + "     data:" + effort.getData();
    }
}
