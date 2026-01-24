package org.example.App;

import org.example.App.Service.Effort;
import org.example.App.Service.IMU;
import org.example.App.Service.LiDAR;
import org.example.App.Service.Sensor;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    Repository repository = new Repository();

//    @GetMapping("/effort")
//    public String stronaGlowna() {
//        return "add-effort";
//    }

    @GetMapping("/efforts")
    public String getEfforts() {
        return repository.getEfforts();
    }

    @GetMapping("/analysis")
    public String analysis() {

        return repository.getEfforts();
    }


    @PostMapping("/effort")
    public String addNewEffort(@RequestBody Effort effort) {
        switch (effort.getSensorType()){
            case IMU -> repository.addSensor(new IMU(effort));
            case LIDAR -> repository.addSensor(new LiDAR(effort));
        }

        return "added new effort";
    }


}
