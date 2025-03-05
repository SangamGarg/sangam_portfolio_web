package sangamportfolioweb.sangamportfolioweb.websiteHome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteHomeController {
    @GetMapping
    String getHomePage(Model model) {
        model.addAttribute("title", "Sangam Garg Portfolio");
        return "home";

    }
}
