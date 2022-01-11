package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

