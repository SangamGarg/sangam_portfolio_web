package sangamportfolioweb.sangamportfolioweb.enums.experienceEnum;

import lombok.Getter;

@Getter
public enum WorkDetails {

    ANDROID_DEVELOPER_INTERN_DETAILS("• Developed and enhanced Android app features by integrating external data sources and RESTful APIs, optimizing data management with in memory database, leading to a 30% improvement in data processing efficiency.\n" +
            "• Implemented in-app ads that contributed to a 15% increase in app-generated revenue.\n" +
            "• Diagnosed and resolved software bugs, performance issues, and performed debugging to ensure high-quality performance, delivering interactive and user-friendly interfaces."),


    JAVA_DEVELOPER_DETAILS("• Optimized customer account lookups, reducing repeated server calls by 40% and improving average response time by 30% during branch customer verification workflows.\n" +
            "• Implemented SQL query optimization and indexing strategies that reduced data retrieval time by over 25%, improving the performance of high-volume extraction jobs.\n" +
            "• Contributed to redundant");

    private final String value;

    WorkDetails(String value) {
        this.value = value;
    }


}
