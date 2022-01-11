package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ApiRest {
    private final UserMaker usermaker;

    public ApiRest() {
        usermaker = new UserMaker();
    }

    @PostMapping("/api/inscription")
    ResponseEntity Usercreate(@RequestBody User user) {
        usermaker.add(user);
        System.out.println(user.userEmail());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/travels")
    ArrayList<Voyage> getVoyage(@RequestParam String userName) {
        ArrayList<Voyage> VoyageArrayList = new ArrayList<>();
        VoyageArrayList.add(new Voyage("France", 10.0));
        VoyageArrayList.add(new Voyage("Suisse", 15.0));
        return VoyageArrayList;
    }
}

