package domgatoru.tutorial.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialThymeleafController {

    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }
}
