package sangamportfolioweb.sangamportfolioweb.contact.email;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailRestControllerForMobile {
    @Autowired
    private EmailServiceNew emailService;

    @PostMapping("/send-email-mobile")
    String sendEmail(@RequestBody EmailWebsiteRequestBody emailRequestBody, Model model) {

        try {
            emailService.sendEmail(emailRequestBody);
            model.addAttribute("successEmail", "I have received your email and will be in contact soon!");
            model.addAttribute("success", "Email sent successfully!");
            return "success";
        } catch (Exception e) {
            System.out.println("Email Error" + e.getLocalizedMessage());
            model.addAttribute("error", "Failed to send email");
            return "error";
        }
    }
}
