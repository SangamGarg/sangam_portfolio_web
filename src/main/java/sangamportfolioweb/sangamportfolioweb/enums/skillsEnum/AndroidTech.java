package sangamportfolioweb.sangamportfolioweb.enums.skillsEnum;

import lombok.Getter;
import sangamportfolioweb.sangamportfolioweb.enums.ExperienceLevel;

@Getter
public enum AndroidTech {
    ANDROID_STUDIO("Android Studio IDE", ExperienceLevel.PROFESSIONAL.name()),
    KOTLIN("Kotlin", ExperienceLevel.PROFESSIONAL.name()),
    JETPACK_COMPOSE("Jetpack Compose", ExperienceLevel.PROFESSIONAL.name()),
    ANDROID_SDK("Android SDK", ExperienceLevel.PROFESSIONAL.name()),
    ANDROID_SERVICES("Services", ExperienceLevel.PROFESSIONAL.name()),
    ANDROID_RECEIVERS("Broadcast Receivers", ExperienceLevel.PROFESSIONAL.name()),
    ANDROID_ACTIVITIES("Activities", ExperienceLevel.PROFESSIONAL.name()),
    ANDROID_PROVIDERS("Content Providers", ExperienceLevel.PROFESSIONAL.name()),
    KOTLIN_FLOWS("Kotlin Flows", ExperienceLevel.PROFESSIONAL.name()),
    COROUTINES("Coroutines", ExperienceLevel.PROFESSIONAL.name()),
    RETROFIT("Retrofit", ExperienceLevel.PROFESSIONAL.name()),
    GOOGLE_ML_KIT("Google ML Kit", ExperienceLevel.PROFESSIONAL.name()),
    GOOGLE_AR_CORE("Google AR CORE", ExperienceLevel.PROFESSIONAL.name()),
    ROOM_DATABASE("ROOM Database", ExperienceLevel.PROFESSIONAL.name()),
    MVVM("MVVM Design Pattern", ExperienceLevel.PROFESSIONAL.name()),
    MVC("MVC Design Pattern", ExperienceLevel.PROFESSIONAL.name()),
    MVP("MVP Design Pattern", ExperienceLevel.PROFESSIONAL.name()),
    UNIT_TESTING("Unit Testing", ExperienceLevel.PROFESSIONAL.name()),
    DAGGER_HILT("Dagger Hilt", ExperienceLevel.PROFESSIONAL.name());



    private final String technology;
    private final String experienceLevel;

    AndroidTech(String technology, String experienceLevel) {
        this.technology = technology;
        this.experienceLevel = experienceLevel;
    }

}
