package sangamportfolioweb.sangamportfolioweb.contact;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sangamportfolioweb.sangamportfolioweb.contact.email.EmailServiceNew;
import sangamportfolioweb.sangamportfolioweb.contact.email.EmailWebsiteRequestBody;

import static sangamportfolioweb.sangamportfolioweb.utils.Constants.*;

@Controller
public class ContactController {

    @GetMapping("/contact")
    String getContact(Model model) {
        try {
            model.addAttribute("mailToEmail", MAIL_TO_EMAIL);
            model.addAttribute("myEmail", MY_EMAIL_ID_GMAIL);
            return "contact";
        } catch (Exception e) {
            model.addAttribute("error", e.getLocalizedMessage());
            return "error";
        }

    }


    @Autowired
    private EmailServiceNew emailService;

    @PostMapping("/send-email")
    String sendEmail(@Valid EmailWebsiteRequestBody emailRequestBody, Model model) {

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
