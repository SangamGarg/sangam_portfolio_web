package sangamportfolioweb.sangamportfolioweb.contact.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceNew {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(EmailWebsiteRequestBody emailWebsiteRequestBody) {
//        LocalDateTime myDateObj = LocalDateTime.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDate = myDateObj.format(myFormatObj);
//        Date date = Date.from(myDateObj.atZone(ZoneId.systemDefault()).toInstant());
//

        SimpleMailMessage message = new SimpleMailMessage();
        String body = String.format("""
                Email: %s
                Name: %s
                Subject: %s
                Message: %s
                """, emailWebsiteRequestBody.getEmail(), emailWebsiteRequestBody.getName(), emailWebsiteRequestBody.getSubject(), emailWebsiteRequestBody.getBody());
        //  message.setSentDate(date);
        message.setTo("sangamgarg17@gmail.com");
        message.setSubject("Sangam Website Portfolio Contact");
        message.setText(body);

        mailSender.send(message);
    }
}
