package sangamportfolioweb.sangamportfolioweb.enums.skillsEnum;

import lombok.Getter;
import sangamportfolioweb.sangamportfolioweb.enums.ExperienceLevel;

@Getter
public enum OthersTech {
    REST_API("REST API", ExperienceLevel.PROFESSIONAL.name()),
    WEB_SOCKETS("Web Sockets", ExperienceLevel.PROFESSIONAL.name()),
    XML("XML", ExperienceLevel.PROFESSIONAL.name()),
    OOP("Object-Oriented Programming", ExperienceLevel.PROFESSIONAL.name()),
    DSA("Data Structures and Algorithms", ExperienceLevel.PROFESSIONAL.name()),
    DI("Dependency Injection (DI)", ExperienceLevel.PROFESSIONAL.name()),
    CLEAN_ARCH("Clean Architecture", ExperienceLevel.PROFESSIONAL.name()),
    JSON("JSON", ExperienceLevel.PROFESSIONAL.name());;

    private final String technology;
    private final String experienceLevel;

    OthersTech(String technology, String experienceLevel) {
        this.technology = technology;
        this.experienceLevel = experienceLevel;
    }

}
