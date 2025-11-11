package sangamportfolioweb.sangamportfolioweb.enums.experienceEnum;

import lombok.Getter;

@Getter
public enum Designations {
    ANDROID_DEVELOPER_INTERN("Android Developer Intern (Oct 2023 – Mar 2024)"),
    JAVA_DEVELOPER("Java Developer (May 2025 – Present)");

    private final String value;

    Designations(String value) {
        this.value = value;
    }

}
