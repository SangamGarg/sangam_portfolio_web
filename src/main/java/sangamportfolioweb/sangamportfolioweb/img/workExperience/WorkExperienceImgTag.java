package sangamportfolioweb.sangamportfolioweb.img.workExperience;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import sangamportfolioweb.sangamportfolioweb.img.ImgTagAttributes;

@Data
@SuperBuilder(toBuilder = true)
public class WorkExperienceImgTag extends ImgTagAttributes {
  private boolean draggable;
  private String company;
  private String designation;
  private String details;
}
