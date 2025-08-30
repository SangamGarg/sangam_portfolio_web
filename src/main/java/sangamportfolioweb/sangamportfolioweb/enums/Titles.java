package sangamportfolioweb.sangamportfolioweb.enums;

import lombok.Getter;

@Getter
public enum Titles {
    SOFTWARE_DEVELOPER("Software Developer"), ANDROID_DEVELOPER("Android Developer"), JAVA_DEVELOPER(
            "Java Developer"), SOFTWARE_ENGINEER("Software Engineer");

    private final String value;

    Titles(String value) {
        this.value = value;
    }

}
