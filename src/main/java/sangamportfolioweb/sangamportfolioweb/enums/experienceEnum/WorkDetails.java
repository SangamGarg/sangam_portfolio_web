package sangamportfolioweb.sangamportfolioweb.enums.experienceEnum;

import lombok.Getter;

@Getter
public enum WorkDetails {

    ANDROID_DEVELOPER_INTERN_DETAILS("•\tExcelled as an Android Developer at Talen Titan Private Limited, enhancing app functionality by integrating external data sources and REST APIs, and optimizing data management with ROOM database, improving data processing efficiency by 30%. Successfully implemented ads in Android applications, contributing to a 15% increase in revenue.\n" +
            "•\tResolved software bugs and performance issues, optimized code, debugging code and ensured high-quality performance, delivering interactive and user-friendly interfaces.\n" +
            "•\tLeveraged modern Android technologies such as MVVM, Retrofit, Kotlin Coroutines, and Kotlin Flows, reducing development time by 20% and ensuring seamless app scalability.\n");

    private final String value;

    WorkDetails(String value) {
        this.value = value;
    }


}
