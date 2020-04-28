package ru.letovo.it.Database.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private UserAction userAction;

    // http://127.0.0.1:8080/list

    @GetMapping("/list")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userAction.findAll();
    }

    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam Integer age, @RequestParam String city) {
        User user = new User();
        user.setAge(age);
        user.setCity(city);
        user.setName(name);
        userAction.save(user);
        return "Saved successefull!";
    }
}
