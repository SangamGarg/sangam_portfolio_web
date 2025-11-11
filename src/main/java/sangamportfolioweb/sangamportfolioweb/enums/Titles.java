package sangamportfolioweb.sangamportfolioweb.enums;

import lombok.Getter;

@Getter
public enum Titles {
    SOFTWARE_ENGINEER("Software Engineer"), ANDROID_DEVELOPER("Android Developer"), JAVA_DEVELOPER(
            "Java Developer");

    private final String value;

    Titles(String value) {
        this.value = value;
    }

}
