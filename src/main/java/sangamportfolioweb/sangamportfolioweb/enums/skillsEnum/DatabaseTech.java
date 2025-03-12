package sangamportfolioweb.sangamportfolioweb.enums.skillsEnum;

import lombok.Getter;
import sangamportfolioweb.sangamportfolioweb.enums.ExperienceLevel;

@Getter
public enum DatabaseTech {
  MYSQL("MySQL", ExperienceLevel.PROFESSIONAL.name()),
  FIREBASE("Firebase", ExperienceLevel.PROFESSIONAL.name()),
  SQLITE("SQLite", ExperienceLevel.PROFESSIONAL.name()),
  MONGODB("MongoDB", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  DatabaseTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
