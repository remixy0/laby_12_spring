package org.example.App.Service;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Effort {
    String athleteName;
    String athleteSurname;
    SensorType sensorType;
    Double dataRate;
    List<Double> data;

    public Effort() {}

    public Effort(String athleteName, String athleteSurname, SensorType sensorType ,List<Double> data) {
        this.athleteName = athleteName;
        this.athleteSurname = athleteSurname;
        this.sensorType = sensorType;
        this.data = data;
    }


}



