package sangamportfolioweb.sangamportfolioweb.enums.skillsEnum;

import lombok.Getter;
import sangamportfolioweb.sangamportfolioweb.enums.ExperienceLevel;

@Getter
public enum ToolsAndApplications {
  INTELLIJ_IDEA("IntelliJ IDEA", ExperienceLevel.PROFESSIONAL.name()),
  GITHUB("GitHub Version Control", ExperienceLevel.PROFESSIONAL.name()),
  DOCKER("Docker (Containerization)", ExperienceLevel.PROFESSIONAL.name()),
  POSTMAN("Postman", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  ToolsAndApplications(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
