package org.example.App;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Repository {
    List<Effort> efforts = new ArrayList<>();

    public String getEfforts() {
        String effortsString = "";
        for (Effort effort : efforts) {
            effortsString += "   " + effort.toString();
        }
        return effortsString;
    }

    public void addEffort(Effort effort) {
        efforts.add(effort);
    }

}
