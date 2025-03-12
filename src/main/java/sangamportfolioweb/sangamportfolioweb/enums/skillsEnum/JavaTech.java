package sangamportfolioweb.sangamportfolioweb.enums.skillsEnum;

import lombok.Getter;
import sangamportfolioweb.sangamportfolioweb.enums.ExperienceLevel;

@Getter
public enum JavaTech {
  JAVA("Java", ExperienceLevel.PROFESSIONAL.name()),
  SPRING_BOOT("Spring Boot", ExperienceLevel.PROFESSIONAL.name()),
  JSP("JSP", ExperienceLevel.PROFESSIONAL.name()),
  SERVLETS("Servlets", ExperienceLevel.PROFESSIONAL.name()),
  SPRING_MVC("Spring MVC", ExperienceLevel.PROFESSIONAL.name()),
  THYMELEAF("Thymeleaf", ExperienceLevel.PROFESSIONAL.name()),
  MICROSERVICES("Microservices architecture", ExperienceLevel.PROFESSIONAL.name()),
  RESTFUL_WEB("RESTful Web Services", ExperienceLevel.PROFESSIONAL.name()),
  HIBERNATE("Hibernate", ExperienceLevel.PROFESSIONAL.name()),

  ;

  private final String technology;
  private final String experienceLevel;

  JavaTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
