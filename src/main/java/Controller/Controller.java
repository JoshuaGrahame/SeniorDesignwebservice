package Controller;

import Models.Example;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class Controller {

    Example example = new Example("", 0);

    public Controller() {
    }

    @PostConstruct
    public void setup()
    {
        example.setX("hello");
        example.setY(10);
    }

    @GetMapping
    public String getX()
    {
        return example.getX();
    }

    @PostMapping
    public String setX(@RequestBody String x)
    {
        example.setX(x);
        return example.getX();
    }
}
