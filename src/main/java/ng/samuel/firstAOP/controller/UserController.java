package ng.samuel.firstAOP.controller;

import lombok.RequiredArgsConstructor;
import ng.samuel.firstAOP.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public String createUser(@RequestParam String name) {
        return userService.createUser(name);
    }
}
