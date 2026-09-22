package sangamportfolioweb.sangamportfolioweb.enums.experienceEnum;

import lombok.Getter;

@Getter
public enum WorkDetails {

    ANDROID_DEVELOPER_INTERN_DETAILS("• Developed and enhanced Android app features by integrating external data sources and RESTful APIs, optimizing data management with in memory database, leading to a 30% improvement in data processing efficiency.\n" +
            "• Implemented in-app ads that contributed to a 15% increase in app-generated revenue.\n" +
            "• Diagnosed and resolved software bugs, performance issues, and performed debugging to ensure high-quality performance, delivering interactive and user-friendly interfaces."),


    JAVA_DEVELOPER_DETAILS("• Engineered enterprise-grade Java backend and batch-processing applications for SBI's Central KYC platform using Java 25, Spring Boot, Java 8, and Spring MVC, enhancing processing throughput by 45% through multithreading solutions allowing data extraction processes to execute concurrently across multiple distributed servers.\n" +
            "• Executed advanced SQL query optimization and database indexing strategies inside the application deployment structure (WAR/JAR), reducing high-volume data retrieval times by over 25%.\n" +
            "• Optimized redundant code, achieving a 20% reduction in code complexity and enhancing overall software maintainability for critical applications.");

    private final String value;

    WorkDetails(String value) {
        this.value = value;
    }


}
