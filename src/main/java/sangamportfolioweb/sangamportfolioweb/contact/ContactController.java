package sangamportfolioweb.sangamportfolioweb.contact;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sangamportfolioweb.sangamportfolioweb.contact.email.EmailApiService;
import sangamportfolioweb.sangamportfolioweb.contact.email.EmailWebsiteRequestBody;

@Controller
public class ContactController {
    @Autowired
    private EmailApiService emailApiService;

    @GetMapping("/contact")
    String getContact(Model model) {
        try {
            return "contact";
        } catch (Exception e) {
            model.addAttribute("error", e.getLocalizedMessage());
            return "error";
        }

    }

    @PostMapping("/send-email")
    String sendEmail(@Valid EmailWebsiteRequestBody emailRequestBody, Model model) {
        try {
            emailApiService.sendMailWebsite(emailRequestBody);
            model.addAttribute("successEmail", "I have received your email and will be in contact soon!");
            model.addAttribute("success", "Email sent successfully!");
            return "success";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to send email");
            return "error";
        }
    }

}
