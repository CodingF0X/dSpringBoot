package demo.microservice1.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/microservice1")
public class Microservice_1_Controller {

  
    @GetMapping
    public String getMessage(){
        return "This is a message from microservice 1";
    }
}
