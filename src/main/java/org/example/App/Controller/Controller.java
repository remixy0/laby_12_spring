package org.example.App.Controller;

import org.example.App.Repository.Repository;
import org.example.App.Service.Effort;
import org.example.App.Service.IMU;
import org.example.App.Service.LiDAR;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    Repository repository = new Repository();

    @GetMapping("/efforts")
    public String getEfforts() {
        return repository.getEfforts();
    }

    @GetMapping("/analysis")
    public String analysis() {return repository.getAnalysis();}



    @PostMapping("/effort")
    public String addNewEffort(@RequestBody Effort effort) {
        switch (effort.getSensorType()){
            case IMU -> repository.addSensor(new IMU(effort));
            case LIDAR -> repository.addSensor(new LiDAR(effort));
        }
        return "added new effort";
    }

    @PutMapping("/effort/{id}")
    public String updateEffort(@PathVariable int id, @RequestBody Effort newEffortData) {
        boolean isUpdated = repository.updateSensor(id, newEffortData);
        if (isUpdated) {
            return "Effort with ID " + id + " updated successfully.";
        } else return "Effort not found.";

    }

    @DeleteMapping("/effort/{id}")
    public String updateEffort(@PathVariable int id) {
        boolean isDone = repository.deleteSensor(id);
        if (isDone) {
            return "Effort with ID " + id + " deleted successfully.";
        }else return "Effort not found.";

    }

}
