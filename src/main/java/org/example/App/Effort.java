package org.example.App;

import java.util.List;

public class Effort {
    String athleteName;
    String athleteSurname;
    List<Double> lapTimes;

    public Effort() {}

    public Effort(String athleteName, String athleteSurname, List<Double> lapTimes) {
        this.athleteName = athleteName;
        this.athleteSurname = athleteSurname;
        this.lapTimes = lapTimes;
    }


    public String getAthleteName() { return athleteName; }
    public void setAthleteName(String athleteName) { this.athleteName = athleteName; }

    public String getAthleteSurname() { return athleteSurname; }
    public void setAthleteSurname(String athleteSurname) { this.athleteSurname = athleteSurname; }

    public List<Double> getLapTimes() { return lapTimes; }
    public void setLapTimes(List<Double> lapTimes) { this.lapTimes = lapTimes; }

    @Override
    public String toString() {
        return athleteName + " " + athleteSurname + "     lap times:" + lapTimes;
    }
}



