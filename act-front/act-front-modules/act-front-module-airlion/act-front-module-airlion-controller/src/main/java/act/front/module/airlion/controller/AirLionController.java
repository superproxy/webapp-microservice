package act.front.module.airlion.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modules/airLion")
public class AirLionController {

    @RequestMapping("/test")
    public String test() {
        return "airLion";
    }
}



