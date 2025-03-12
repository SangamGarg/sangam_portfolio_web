package sangamportfolioweb.sangamportfolioweb.img.social;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import sangamportfolioweb.sangamportfolioweb.img.ImgTagAttributes;

@Data
@SuperBuilder(toBuilder = true)
public class SocialMediaImgTag extends ImgTagAttributes {
  private String onClickAction;
}
