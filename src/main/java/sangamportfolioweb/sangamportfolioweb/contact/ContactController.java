package sangamportfolioweb.sangamportfolioweb.contact;

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
    String getSupport(Model model) {
        try {
            return "contact";
        } catch (Exception e) {
            model.addAttribute("error", e.getLocalizedMessage());
            return "error";
        }

    }

    @PostMapping("/send-email")
    String sendEmail(@RequestParam String name, @RequestParam String email, @RequestParam String subject, @RequestParam String body, Model model) {
        try {
            EmailWebsiteRequestBody emailRequestBody = new EmailWebsiteRequestBody(name, email, subject, body);
            emailApiService.sendMailWebsite(emailRequestBody);
            model.addAttribute("success", "Email sent successfully!");
        } catch (Exception e) {
            model.addAttribute("error", "Failed to send email: " + e.getMessage());
        }
        return "redirect:/contact";
    }

}
