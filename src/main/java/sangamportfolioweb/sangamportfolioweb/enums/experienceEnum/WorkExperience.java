package sangamportfolioweb.sangamportfolioweb.enums.experienceEnum;

import lombok.Getter;

@Getter
public enum WorkExperience {
    TALEN_TITAN("Talen Titan pvt ltd"),
    TCS("Tata Consultancy Services (TCS)");

    private final String value;

    WorkExperience(String value) {
        this.value = value;
    }

}
