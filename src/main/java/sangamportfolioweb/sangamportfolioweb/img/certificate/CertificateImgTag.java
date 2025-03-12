package sangamportfolioweb.sangamportfolioweb.img.certificate;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import sangamportfolioweb.sangamportfolioweb.img.ImgTagAttributes;

@Data
@SuperBuilder(toBuilder = true)
public class CertificateImgTag extends ImgTagAttributes {
  private String projectName;
  private String onCredentialClickAction;
//  private String onLiveDemoClickAction;
}
