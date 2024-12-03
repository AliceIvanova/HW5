import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
  @BeforeAll
  static void setUp() {
    com.codeborne.selenide.Configuration.browserSize = "1920x1080";
    Configuration.browser = "edge";
  }
  @Test
  void dragAndDrop() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDrop(DragAndDropOptions.to ("#column-b"));
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
  }
}
