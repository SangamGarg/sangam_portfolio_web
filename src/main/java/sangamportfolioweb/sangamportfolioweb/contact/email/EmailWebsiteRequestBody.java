package sangamportfolioweb.sangamportfolioweb.contact.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailWebsiteRequestBody {
    private String name;
    private String email;
    private String subject;
    private String body;
}
