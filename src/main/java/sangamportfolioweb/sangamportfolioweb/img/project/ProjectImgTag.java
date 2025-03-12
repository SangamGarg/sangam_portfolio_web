package sangamportfolioweb.sangamportfolioweb.img.project;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import sangamportfolioweb.sangamportfolioweb.img.ImgTagAttributes;

@Data
@SuperBuilder(toBuilder = true)
public class ProjectImgTag extends ImgTagAttributes {
  private String projectName;
  private String onGithubClickAction;
  private String onLiveDemoClickAction;
}
