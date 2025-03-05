package sangamportfolioweb.sangamportfolioweb.contact.email;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequestBody {

    @NotBlank(message = "Subject Cannot Be Blank")
    private String subject;

    @NotBlank(message = "Body Cannot Be Blank")
    private String body;
}
