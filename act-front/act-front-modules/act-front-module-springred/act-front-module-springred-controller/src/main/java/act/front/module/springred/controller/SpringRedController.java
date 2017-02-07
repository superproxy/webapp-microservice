package act.front.module.springred.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/modules/springRed")
@RestController
public class SpringRedController {

    @RequestMapping("/test")
    public String test() {
        return "springRed";
    }
}
