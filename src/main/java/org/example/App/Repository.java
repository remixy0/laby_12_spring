package org.example.App;

import org.example.App.Service.Effort;
import org.example.App.Service.Sensor;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Sensor> sensors = new ArrayList<>();

    public String getEfforts() {
        String effortsString = "";
        for (Sensor effort : sensors) {
            effortsString += "   " + effort.toString();
        }
        return effortsString;
    }

    public void addSensor(Sensor effort) {
        sensors.add(effort);
    }

}
