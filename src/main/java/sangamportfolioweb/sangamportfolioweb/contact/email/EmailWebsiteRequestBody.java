package sangamportfolioweb.sangamportfolioweb.contact.email;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailWebsiteRequestBody {
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String subject;
    @NotBlank
    private String body;
}
