package sangamportfolioweb.sangamportfolioweb.quonotePrivacyPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuonotePPController {
    @Autowired
    private QuonotePPService privacyPolicyService;

    @GetMapping("/quonotePrivacyPolicy")
    String getPrivacyPolicy(Model model) {
        try {
            QuonotePPResponseModel responseModel = privacyPolicyService.getPrivacyPolicy();
            model.addAttribute("privacyPolicy", responseModel);
            return "privacyPolicy";
        } catch (Exception e) {
            model.addAttribute("error", e.getLocalizedMessage());
            return "error";
        }

    }
}
