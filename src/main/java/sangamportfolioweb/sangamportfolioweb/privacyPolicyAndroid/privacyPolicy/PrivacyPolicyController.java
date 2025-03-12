package sangamportfolioweb.sangamportfolioweb.privacyPolicyAndroid.privacyPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivacyPolicyController {

    @Autowired
    private PrivacyPolicyService privacyPolicyService;

    @GetMapping("/privacyPolicy")
    String getPrivacyPolicy(Model model) {
        try {
            PrivacyPolicyResponseModel responseModel = privacyPolicyService.getPrivacyPolicy();
            model.addAttribute("privacyPolicy", responseModel);
            return "privacyPolicy";
        } catch (Exception e) {
            model.addAttribute("error", e.getLocalizedMessage());
            return "error";
        }

    }
}
