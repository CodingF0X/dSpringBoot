package demo.microservice2.ms2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/microservice2")
public class Microservice_2_Controller {

    @GetMapping
    public String getMessage(){
        return "This message is from microservice 2";
    }
}
