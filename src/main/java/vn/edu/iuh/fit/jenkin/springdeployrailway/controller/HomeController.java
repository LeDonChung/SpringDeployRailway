package vn.edu.iuh.fit.jenkin.springdeployrailway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
    @GetMapping("/cal")
    public String home(@RequestParam Integer a, @RequestParam Integer b) {
        return "Result: " + (a + b);
    }
}
