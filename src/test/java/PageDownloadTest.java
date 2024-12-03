import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageDownloadTest {
  @BeforeAll
  static void setup() {
    com.codeborne.selenide.Configuration.browserSize = "1920x1080";
    Configuration.browser = "edge";
  }
  @Test
  void pageOpen() {
    open("https://github.com");
    $(byText("Solutions")).hover();
  $(byText("Enterprises")).click();
  $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    sleep(5000);
  }
}
