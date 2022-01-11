package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {
    @PostMapping("/api/inscription")
    ResponseEntity Usercreate (@RequestBody User user) {
        System.out.println("salutmagueule");
        return ResponseEntity.ok().build();
    }
}
