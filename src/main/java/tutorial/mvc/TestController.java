package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vemilov on 14.6.2016 г..
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
