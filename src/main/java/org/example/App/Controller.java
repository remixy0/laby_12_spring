package org.example.App;

import org.springframework.ui.Model;
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


    @PostMapping("/effort")
    public String addNewEffort(@RequestBody Effort effort) {
        repository.addEffort(effort);
        return "added new effort";
    }


}
