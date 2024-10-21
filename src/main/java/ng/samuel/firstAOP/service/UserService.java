package ng.samuel.firstAOP.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(int id) {
        // Simulating some business logic
        return "User with ID: " + id;
    }

    public String createUser(String name) {
        // Simulating user creation
        return "User " + name + " created.";
    }
}
