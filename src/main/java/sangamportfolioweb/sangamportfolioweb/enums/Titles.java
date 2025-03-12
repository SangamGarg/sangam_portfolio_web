package sangamportfolioweb.sangamportfolioweb.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPMENT_ENGINEER("Software Developer"), CONTENT_CREATOR("Android Developer"), MUSIC_PRODUCER(
      "Java Developer");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
